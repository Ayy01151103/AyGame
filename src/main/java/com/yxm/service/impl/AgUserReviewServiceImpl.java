package com.yxm.service.impl;/*
package com.AyGame.service.system.impl;

import com.AyGame.core.model.PageData;
import com.AyGame.core.model.PageWrap;
import com.AyGame.core.utils.ExampleBuilder;
import com.AyGame.dao.system.AgUserReviewMapper;
import com.AyGame.dao.system.model.AgUserReview;
import com.AyGame.dao.system.model.AgUserReviewExample;
import com.AyGame.service.system.AgUserReviewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

*/
/**
 * 用户评论Service实现
 *
 * @author 阿咿呀羊
 * @date 2022/03/12 03:03
 *//*

@Service
public class AgUserReviewServiceImpl implements AgUserReviewService {

    @Autowired
    private AgUserReviewMapper agUserReviewMapper;

    @Override
    public String create(AgUserReview agUserReview) {
        agUserReviewMapper.insertSelective(agUserReview);
        return agUserReview.getFdId();
    }

    @Override
    public void deleteById(String id) {
        agUserReviewMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<String> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (String id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(AgUserReview agUserReview) {
        agUserReviewMapper.updateByPrimaryKeySelective(agUserReview);
    }

    @Override
    public void updateByIdInBatch(List<AgUserReview> agUserReviews) {
        if (CollectionUtils.isEmpty(agUserReviews)) return;
        for (AgUserReview agUserReview: agUserReviews) {
            this.updateById(agUserReview);
        }
    }

    @Override
    public AgUserReview findById(String id) {
        return agUserReviewMapper.selectByPrimaryKey(id);
    }

    @Override
    public AgUserReview findOne(AgUserReview agUserReview) {
        ExampleBuilder<AgUserReviewExample, AgUserReviewExample.Criteria> builder = ExampleBuilder.create(AgUserReviewExample.class, AgUserReviewExample.Criteria.class);
        List<AgUserReview> agUserReviews = agUserReviewMapper.selectByExample(builder.buildExamplePack(agUserReview).getExample());
        if (agUserReviews.size() > 0) {
            return agUserReviews.get(0);
        }
        return null;
    }

    @Override
    public List<AgUserReview> findList(AgUserReview agUserReview) {
        ExampleBuilder<AgUserReviewExample, AgUserReviewExample.Criteria> builder = ExampleBuilder.create(AgUserReviewExample.class, AgUserReviewExample.Criteria.class);
        return agUserReviewMapper.selectByExample(builder.buildExamplePack(agUserReview).getExample());
    }
  
    @Override
    public PageData<AgUserReview> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<AgUserReviewExample, AgUserReviewExample.Criteria> builder = ExampleBuilder.create(AgUserReviewExample.class, AgUserReviewExample.Criteria.class);
        ExampleBuilder.ExamplePack<AgUserReviewExample, AgUserReviewExample.Criteria> pack = builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(agUserReviewMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(AgUserReview agUserReview) {
        ExampleBuilder<AgUserReviewExample, AgUserReviewExample.Criteria> builder = ExampleBuilder.create(AgUserReviewExample.class, AgUserReviewExample.Criteria.class);
        return agUserReviewMapper.countByExample(builder.buildExamplePack(agUserReview).getExample());
    }
}
*/
