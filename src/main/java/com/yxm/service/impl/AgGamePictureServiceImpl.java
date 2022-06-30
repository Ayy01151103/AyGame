package com.yxm.service.impl;/*
package com.AyGame.service.system.impl;

import com.AyGame.core.model.PageData;
import com.AyGame.core.model.PageWrap;
import com.AyGame.core.utils.ExampleBuilder;
import com.AyGame.dao.system.AgGamePictureMapper;
import com.AyGame.dao.system.model.AgGamePicture;
import com.AyGame.dao.system.model.AgGamePictureExample;
import com.AyGame.service.system.AgGamePictureService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

*/
/**
 * 游戏所属图片Service实现
 *
 * @author 阿咿呀羊
 * @date 2022/03/12 03:03
 *//*

@Service
public class AgGamePictureServiceImpl implements AgGamePictureService {

    @Autowired
    private AgGamePictureMapper agGamePictureMapper;

    @Override
    public String create(AgGamePicture agGamePicture) {
        agGamePictureMapper.insertSelective(agGamePicture);
        return agGamePicture.getFdId();
    }

    @Override
    public void deleteById(String id) {
        agGamePictureMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<String> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (String id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(AgGamePicture agGamePicture) {
        agGamePictureMapper.updateByPrimaryKeySelective(agGamePicture);
    }

    @Override
    public void updateByIdInBatch(List<AgGamePicture> agGamePictures) {
        if (CollectionUtils.isEmpty(agGamePictures)) return;
        for (AgGamePicture agGamePicture: agGamePictures) {
            this.updateById(agGamePicture);
        }
    }

    @Override
    public AgGamePicture findById(String id) {
        return agGamePictureMapper.selectByPrimaryKey(id);
    }

    @Override
    public AgGamePicture findOne(AgGamePicture agGamePicture) {
        ExampleBuilder<AgGamePictureExample, AgGamePictureExample.Criteria> builder = ExampleBuilder.create(AgGamePictureExample.class, AgGamePictureExample.Criteria.class);
        List<AgGamePicture> agGamePictures = agGamePictureMapper.selectByExample(builder.buildExamplePack(agGamePicture).getExample());
        if (agGamePictures.size() > 0) {
            return agGamePictures.get(0);
        }
        return null;
    }

    @Override
    public List<AgGamePicture> findList(AgGamePicture agGamePicture) {
        ExampleBuilder<AgGamePictureExample, AgGamePictureExample.Criteria> builder = ExampleBuilder.create(AgGamePictureExample.class, AgGamePictureExample.Criteria.class);
        return agGamePictureMapper.selectByExample(builder.buildExamplePack(agGamePicture).getExample());
    }
  
    @Override
    public PageData<AgGamePicture> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<AgGamePictureExample, AgGamePictureExample.Criteria> builder = ExampleBuilder.create(AgGamePictureExample.class, AgGamePictureExample.Criteria.class);
        ExampleBuilder.ExamplePack<AgGamePictureExample, AgGamePictureExample.Criteria> pack = builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(agGamePictureMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(AgGamePicture agGamePicture) {
        ExampleBuilder<AgGamePictureExample, AgGamePictureExample.Criteria> builder = ExampleBuilder.create(AgGamePictureExample.class, AgGamePictureExample.Criteria.class);
        return agGamePictureMapper.countByExample(builder.buildExamplePack(agGamePicture).getExample());
    }
}
*/
