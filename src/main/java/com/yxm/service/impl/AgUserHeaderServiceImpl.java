package com.yxm.service.impl;/*
package com.AyGame.service.system.impl;

import com.AyGame.core.model.PageData;
import com.AyGame.core.model.PageWrap;
import com.AyGame.core.utils.ExampleBuilder;
import com.AyGame.dao.system.AgUserHeaderMapper;
import com.AyGame.dao.system.model.AgUserHeader;
import com.AyGame.dao.system.model.AgUserHeaderExample;
import com.AyGame.service.system.AgUserHeaderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

*/
/**
 * 用户头像Service实现
 *
 * @author 阿咿呀羊
 * @date 2022/03/12 03:03
 *//*

@Service
public class AgUserHeaderServiceImpl implements AgUserHeaderService {

    @Autowired
    private AgUserHeaderMapper agUserHeaderMapper;

    @Override
    public String create(AgUserHeader agUserHeader) {
        agUserHeaderMapper.insertSelective(agUserHeader);
        return agUserHeader.getFdId();
    }

    @Override
    public void deleteById(String id) {
        agUserHeaderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<String> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (String id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(AgUserHeader agUserHeader) {
        agUserHeaderMapper.updateByPrimaryKeySelective(agUserHeader);
    }

    @Override
    public void updateByIdInBatch(List<AgUserHeader> agUserHeaders) {
        if (CollectionUtils.isEmpty(agUserHeaders)) return;
        for (AgUserHeader agUserHeader: agUserHeaders) {
            this.updateById(agUserHeader);
        }
    }

    @Override
    public AgUserHeader findById(String id) {
        return agUserHeaderMapper.selectByPrimaryKey(id);
    }

    @Override
    public AgUserHeader findOne(AgUserHeader agUserHeader) {
        ExampleBuilder<AgUserHeaderExample, AgUserHeaderExample.Criteria> builder = ExampleBuilder.create(AgUserHeaderExample.class, AgUserHeaderExample.Criteria.class);
        List<AgUserHeader> agUserHeaders = agUserHeaderMapper.selectByExample(builder.buildExamplePack(agUserHeader).getExample());
        if (agUserHeaders.size() > 0) {
            return agUserHeaders.get(0);
        }
        return null;
    }

    @Override
    public List<AgUserHeader> findList(AgUserHeader agUserHeader) {
        ExampleBuilder<AgUserHeaderExample, AgUserHeaderExample.Criteria> builder = ExampleBuilder.create(AgUserHeaderExample.class, AgUserHeaderExample.Criteria.class);
        return agUserHeaderMapper.selectByExample(builder.buildExamplePack(agUserHeader).getExample());
    }
  
    @Override
    public PageData<AgUserHeader> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<AgUserHeaderExample, AgUserHeaderExample.Criteria> builder = ExampleBuilder.create(AgUserHeaderExample.class, AgUserHeaderExample.Criteria.class);
        ExampleBuilder.ExamplePack<AgUserHeaderExample, AgUserHeaderExample.Criteria> pack = builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(agUserHeaderMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(AgUserHeader agUserHeader) {
        ExampleBuilder<AgUserHeaderExample, AgUserHeaderExample.Criteria> builder = ExampleBuilder.create(AgUserHeaderExample.class, AgUserHeaderExample.Criteria.class);
        return agUserHeaderMapper.countByExample(builder.buildExamplePack(agUserHeader).getExample());
    }
}
*/
