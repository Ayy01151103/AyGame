package com.yxm.service.impl;


import com.yxm.dao.AgUserMainMapper;
import com.yxm.service.AgUserMainService;
import com.yxm.utils.Utils;
import com.yxm.vo.PageData;
import com.yxm.vo.PageWrap;
import com.yxm.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 用户Service实现
 *
 * @author 阿咿呀羊
 * @date 2022/03/12 03:03
 */
@Service
public class AgUserMainServiceImpl implements AgUserMainService {

    @Autowired
    private AgUserMainMapper agUserMainMapper;

    @Override
    public Integer create(User agUserMain) {
        agUserMainMapper.insertSelective(agUserMain);
        return agUserMain.getId();
    }

    @Override
    public void insert(User agUserMain) {
        List<User> list = agUserMainMapper.selectAllUsers();
        List<User> userList = agUserMainMapper.selectUserName(agUserMain.getName());
        if (userList.size() > 0) {
            System.out.println("用户名重复");
        } else {
            agUserMain.setPassword("123");
            agUserMainMapper.insert(agUserMain);
        }
    }

    @Override
    public void deleteById(Integer id) {
        agUserMainMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<String> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return;
        }
      /*  for (String id: ids) {
            this.deleteById(id);
        }*/
    }

    @Override
    public void updateById(User agUserMain) {
        String password = Utils.sha1(agUserMain.getPassword());
        agUserMain.setPassword(password);
        agUserMainMapper.updateByPrimaryKeySelective(agUserMain);
    }

    @Override
    public void updateByIdInBatch(List<User> agUserMains) {
        if (CollectionUtils.isEmpty(agUserMains)) {
            return;
        }
        for (User agUserMain : agUserMains) {
            this.updateById(agUserMain);
        }
    }

    @Override
    public User findById(Integer id) {

        return agUserMainMapper.selectByPrimaryKey(id);
    }

    @Override
    public User findOne(User agUserMain) {
        return null;
    }

    @Override
    public List<User> findList(User agUserMain) {
        return agUserMainMapper.selectByName(agUserMain);
    }

    @Override
    public PageData<User> findPage(PageWrap<User> pageWrap) {
        return null;
    }

    @Override
    public long count(User agUserMain) {
        return 0;
    }

    @Override
    public List<User> findAllUsers() {
        /*使用pagehepler 实现分页*/
  /*      PageHelper.startPage(2,3);
        List<User> list = agUserMainMapper.selectAllUsers();
        PageInfo<User> pi = new PageInfo<>(list);
        pi.getList();*/
        return agUserMainMapper.selectAllUsers();
    }


}
