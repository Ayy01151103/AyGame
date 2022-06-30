package com.yxm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxm.dao.CategoryDao;
import com.yxm.vo.Category;
import com.yxm.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;


/**
 * @author panyang
 */
@Controller
@RequestMapping(value = "/admin/category")
public class AdminCategoryController extends AdminController {
    @Autowired
    private CategoryDao categoryDao;

    //***********分类部分***********

    @GetMapping("")
    public String getCategory(Model model,String name,@RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum, @RequestParam(defaultValue = "10", value = "pageSize") Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        /*if ( name!= null) {
                name = "%" + name + "%";
        }*/
        List<Category> category = categoryDao.getAllCategories();
        PageInfo<Category> pageInfo = new PageInfo<>(category);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("category", category);
        return "AyGame/admin/category/category_manager";
    }

    @GetMapping(value = "/add")
    public String addCategory(Model model) {
        model.addAttribute("category", new Category());
        return "AyGame/admin/category/category_add";
    }

    @PostMapping("/add")
    public String addCategory(Category category, HttpSession session, Model model) {
        category.setId(null);
        if (categoryDao.getCategory(category) == null) {
            int result = categoryDao.insert(category);
            User user = (User) session.getAttribute("user");
            if (result > 0) {
                user.getMessages().addFirst("时间：" + new Date() + ",添加分类信息成功。");
                return "redirect:/admin/category";
            } else {
                model.addAttribute("message", "添加失败");
            }
        } else {
            model.addAttribute("message", "添加失败，分类已存在");
        }
        return "redirect:/admin/category";
    }

    @GetMapping("/update/{id}")
    public String updateCategory(@PathVariable int id, Model model) {
        Category category = categoryDao.getCategory(new Category(id));
        model.addAttribute("category", category);
        return "AyGame/admin/category/category_edit";
    }


    @PutMapping("/update/{id}")
    public String updateCategory(@PathVariable Integer id, Category category, HttpSession session, Model model) {
        if (id != null && id.equals(category.getId())) {
            int result = categoryDao.update(category);
            User user = (User) session.getAttribute("user");
            if (result > 0) {
                user.getMessages().addFirst("时间：" + new Date() + ",修改分类信息成功。");
                return "redirect:/admin/category";
            } else {
                model.addAttribute("message", "修改失败");
            }
        } else {
            model.addAttribute("message", "修改失败，ID不匹配");
        }
        return "admin/updateCategory";
    }

    @RequestMapping("/{id}")
    public String deleteCategory(@PathVariable("id") Integer id, Category category, HttpSession session, Model model) {
        if (id != null && id.equals(category.getId())) {
            int result = categoryDao.deleteCategory(category);
            User user = (User) session.getAttribute("user");
            if (result > 0) {
                user.getMessages().addFirst("时间：" + new Date() + ",删除分类信息成功。");
                return "redirect:/admin/category";
            } else {
                model.addAttribute("message", "修改失败");
            }
        }
        return "redirect:/admin/category";
    }

}
