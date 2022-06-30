/*

package com.yxm.service.impl;

import com.AyGame.core.model.PageData;
import com.AyGame.core.model.PageWrap;
import com.AyGame.dao.user.AgGameCategoryMapper;
import com.AyGame.dao.user.model.AgGameCategory;
import com.AyGame.service.user.AgGameCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;


*/
/**
 * 游戏所属分类Service实现
 *
 * @author 阿咿呀羊
 * @date 2022/03/12 03:03
 *//*



@Service
public class AgGameCategoryServiceImpl implements AgGameCategoryService {

    @Autowired
    private AgGameCategoryMapper agGameCategoryMapper;

    @Override
    public String create(AgGameCategory agGameCategory) {
        agGameCategoryMapper.insertSelective(agGameCategory);
        return agGameCategory.getFdId();
    }

    @Override
    public void deleteById(String id) {
        agGameCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<String> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (String id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(AgGameCategory agGameCategory) {
        agGameCategoryMapper.updateByPrimaryKeySelective(agGameCategory);
    }

    @Override
    public void updateByIdInBatch(List<AgGameCategory> agGameCategorys) {

    }

    @Override
    public AgGameCategory findById(String id) {
        return null;
    }

    @Override
    public AgGameCategory findOne(AgGameCategory agGameCategory) {
        return null;
    }

    @Override
    public List<AgGameCategory> findList(AgGameCategory agGameCategory) {
        return null;
    }

    @Override
    public PageData<AgGameCategory> findPage(PageWrap<AgGameCategory> pageWrap) {
        return null;
    }

    @Override
    public long count(AgGameCategory agGameCategory) {
        return 0;
    }


}


*/
