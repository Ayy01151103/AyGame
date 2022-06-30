package com.yxm.service.impl;/*
package com.AyGame.service.system.impl;

import com.AyGame.core.model.PageData;
import com.AyGame.core.model.PageWrap;
import com.AyGame.core.utils.ExampleBuilder;
import com.AyGame.dao.system.AgUserLibraryMapper;
import com.AyGame.dao.system.model.AgUserLibrary;
import com.AyGame.dao.system.model.AgUserLibraryExample;
import com.AyGame.service.system.AgUserLibraryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

*/
/**
 * 用户所属游戏Service实现
 *
 * @author 阿咿呀羊
 * @date 2022/03/12 03:03
 *//*

@Service
public class AgUserLibraryServiceImpl implements AgUserLibraryService {

    @Autowired
    private AgUserLibraryMapper agUserLibraryMapper;

    @Override
    public String create(AgUserLibrary agUserLibrary) {
        agUserLibraryMapper.insertSelective(agUserLibrary);
        return agUserLibrary.getFdId();
    }

    @Override
    public void deleteById(String id) {
        agUserLibraryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<String> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (String id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(AgUserLibrary agUserLibrary) {
        agUserLibraryMapper.updateByPrimaryKeySelective(agUserLibrary);
    }

    @Override
    public void updateByIdInBatch(List<AgUserLibrary> agUserLibrarys) {
        if (CollectionUtils.isEmpty(agUserLibrarys)) return;
        for (AgUserLibrary agUserLibrary: agUserLibrarys) {
            this.updateById(agUserLibrary);
        }
    }

    @Override
    public AgUserLibrary findById(String id) {
        return agUserLibraryMapper.selectByPrimaryKey(id);
    }

    @Override
    public AgUserLibrary findOne(AgUserLibrary agUserLibrary) {
        ExampleBuilder<AgUserLibraryExample, AgUserLibraryExample.Criteria> builder = ExampleBuilder.create(AgUserLibraryExample.class, AgUserLibraryExample.Criteria.class);
        List<AgUserLibrary> agUserLibrarys = agUserLibraryMapper.selectByExample(builder.buildExamplePack(agUserLibrary).getExample());
        if (agUserLibrarys.size() > 0) {
            return agUserLibrarys.get(0);
        }
        return null;
    }

    @Override
    public List<AgUserLibrary> findList(AgUserLibrary agUserLibrary) {
        ExampleBuilder<AgUserLibraryExample, AgUserLibraryExample.Criteria> builder = ExampleBuilder.create(AgUserLibraryExample.class, AgUserLibraryExample.Criteria.class);
        return agUserLibraryMapper.selectByExample(builder.buildExamplePack(agUserLibrary).getExample());
    }
  
    @Override
    public PageData<AgUserLibrary> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<AgUserLibraryExample, AgUserLibraryExample.Criteria> builder = ExampleBuilder.create(AgUserLibraryExample.class, AgUserLibraryExample.Criteria.class);
        ExampleBuilder.ExamplePack<AgUserLibraryExample, AgUserLibraryExample.Criteria> pack = builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(agUserLibraryMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(AgUserLibrary agUserLibrary) {
        ExampleBuilder<AgUserLibraryExample, AgUserLibraryExample.Criteria> builder = ExampleBuilder.create(AgUserLibraryExample.class, AgUserLibraryExample.Criteria.class);
        return agUserLibraryMapper.countByExample(builder.buildExamplePack(agUserLibrary).getExample());
    }
}
*/
