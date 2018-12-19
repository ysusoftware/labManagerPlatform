package org.software.ysu.service.achievements;

import org.software.ysu.dao.IntroductionMapper;
import org.software.ysu.pojo.Introduction;
import org.software.ysu.pojo.IntroductionExample;
import org.software.ysu.pojo.IntroductionWithBLOBs;
import org.software.ysu.service.Interface.IIntroService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Erisu
 * @date 2018/12/17 10:36
 * @Description intro实现
 * @Version 1.0
 **/
@Service
public class IntroductionServiceImpI implements IIntroService {
    @Resource
    IntroductionMapper introductionMapper;
    @Override
    public int addIntro(IntroductionWithBLOBs introduction) {
        return introductionMapper.insertSelective(introduction);
    }

    @Override
    public List<IntroductionWithBLOBs> getIntros(IntroductionExample introductionExample) {
        return introductionMapper.selectByExampleWithBLOBs(introductionExample);
    }

    @Override
    public int delIntro(int id) {
        return introductionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateIntro(IntroductionWithBLOBs introduction) {
        return introductionMapper.updateByPrimaryKeySelective(introduction);
    }

    @Override
    public int countIntro(IntroductionExample introductionExample) {
        return (int)introductionMapper.countByExample(introductionExample);
    }

    @Override
    public IntroductionWithBLOBs getIntroById(Integer id) {
        return introductionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delIntroByExample(IntroductionExample example) {
        return introductionMapper.deleteByExample(example);
    }
}
