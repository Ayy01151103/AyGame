package com.yxm.service.impl;/*
package com.AyGame.service.system.impl;

import com.AyGame.core.model.PageData;
import com.AyGame.core.model.PageWrap;
import com.AyGame.core.utils.ExampleBuilder;
import com.AyGame.dao.system.AgGamePlatformMapper;
import com.AyGame.dao.system.model.AgGamePlatform;
import com.AyGame.dao.system.model.AgGamePlatformExample;
import com.AyGame.service.system.AgGamePlatformService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

*/
/**
 * 游戏所属平台Service实现
 *
 * @author 阿咿呀羊
 * @date 2022/03/12 03:03
 *//*

@Service
public class AgGamePlatformServiceImpl implements AgGamePlatformService {

    @Autowired
    private AgGamePlatformMapper agGamePlatformMapper;

    @Override
    public String create(AgGamePlatform agGamePlatform) {
        agGamePlatformMapper.insertSelective(agGamePlatform);
        return agGamePlatform.getFdId();
    }

    @Override
    public void deleteById(String id) {
        agGamePlatformMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<String> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (String id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(AgGamePlatform agGamePlatform) {
        agGamePlatformMapper.updateByPrimaryKeySelective(agGamePlatform);
    }

    @Override
    public void updateByIdInBatch(List<AgGamePlatform> agGamePlatforms) {
        if (CollectionUtils.isEmpty(agGamePlatforms)) return;
        for (AgGamePlatform agGamePlatform: agGamePlatforms) {
            this.updateById(agGamePlatform);
        }
    }

    @Override
    public AgGamePlatform findById(String id) {
        return agGamePlatformMapper.selectByPrimaryKey(id);
    }

    @Override
    public AgGamePlatform findOne(AgGamePlatform agGamePlatform) {
        ExampleBuilder<AgGamePlatformExample, AgGamePlatformExample.Criteria> builder = ExampleBuilder.create(AgGamePlatformExample.class, AgGamePlatformExample.Criteria.class);
        List<AgGamePlatform> agGamePlatforms = agGamePlatformMapper.selectByExample(builder.buildExamplePack(agGamePlatform).getExample());
        if (agGamePlatforms.size() > 0) {
            return agGamePlatforms.get(0);
        }
        return null;
    }

    @Override
    public List<AgGamePlatform> findList(AgGamePlatform agGamePlatform) {
        ExampleBuilder<AgGamePlatformExample, AgGamePlatformExample.Criteria> builder = ExampleBuilder.create(AgGamePlatformExample.class, AgGamePlatformExample.Criteria.class);
        return agGamePlatformMapper.selectByExample(builder.buildExamplePack(agGamePlatform).getExample());
    }
  
    @Override
    public PageData<AgGamePlatform> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<AgGamePlatformExample, AgGamePlatformExample.Criteria> builder = ExampleBuilder.create(AgGamePlatformExample.class, AgGamePlatformExample.Criteria.class);
        ExampleBuilder.ExamplePack<AgGamePlatformExample, AgGamePlatformExample.Criteria> pack = builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(agGamePlatformMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(AgGamePlatform agGamePlatform) {
        ExampleBuilder<AgGamePlatformExample, AgGamePlatformExample.Criteria> builder = ExampleBuilder.create(AgGamePlatformExample.class, AgGamePlatformExample.Criteria.class);
        return agGamePlatformMapper.countByExample(builder.buildExamplePack(agGamePlatform).getExample());
    }
}
*/
