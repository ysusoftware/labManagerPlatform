package org.software.ysu.service.achievements;

import org.software.ysu.dao.AssortMapper;
import org.software.ysu.pojo.Assort;
import org.software.ysu.pojo.AssortExample;
import org.software.ysu.service.Interface.IAssortService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AssortServiceImpl implements IAssortService {
    @Resource
    AssortMapper assortMapper;

    @Override
    public List<Assort> getAssorts() {
        AssortExample assortExample=new AssortExample();
        assortExample.createCriteria();
        List<Assort> lists=assortMapper.selectByExample(assortExample);
        return lists;
    }

    @Override
    public List<Assort> getAssort1s() {
        AssortExample assortExample=new AssortExample();
        assortExample.createCriteria().andAssortParentidEqualTo(0);
        List<Assort> assorts=assortMapper.selectByExample(assortExample);
        return assorts;
    }

    @Override
    public List<Assort> getAssort2s(Integer parentId) {
        AssortExample assortExample=new AssortExample();
        assortExample.createCriteria().andAssortParentidEqualTo(parentId);
        List<Assort> lists=assortMapper.selectByExample(assortExample);
        return lists;
    }

    @Override
    public Assort getAssort(Integer id) {
        return assortMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Assort> getAssortList() {
        AssortExample assortExample=new AssortExample();
        assortExample.createCriteria();
        return assortMapper.selectByExample(assortExample);
    }

    @Override
    public int addAssort(Assort assort) {
        return assortMapper.insertSelective(assort);
    }

    @Override
    public int editAssort(Assort assort) {
        return assortMapper.updateByPrimaryKeySelective(assort);
    }
}
