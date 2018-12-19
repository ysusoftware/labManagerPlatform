package org.software.ysu.service.Interface;

import org.software.ysu.pojo.IntroductionExample;
import org.software.ysu.pojo.IntroductionWithBLOBs;

import java.util.List;

/**
 * @author Erisu
 * @date 2018/12/17 10:32
 * @Description intro接口
 * @Version 1.0
 **/
public interface IIntroService {
    public int addIntro(IntroductionWithBLOBs introduction);
    public List<IntroductionWithBLOBs> getIntros(IntroductionExample introductionExample);
    public int delIntro(int id);
    public int updateIntro(IntroductionWithBLOBs introduction);
    public int countIntro(IntroductionExample introductionExample);
    public IntroductionWithBLOBs getIntroById(Integer id);
    public int delIntroByExample(IntroductionExample example);
}
