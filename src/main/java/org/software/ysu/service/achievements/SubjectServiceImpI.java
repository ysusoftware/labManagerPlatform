package org.software.ysu.service.achievements;

import org.software.ysu.dao.SubjectMapper;
import org.software.ysu.pojo.Subject;
import org.software.ysu.pojo.SubjectExample;
import org.software.ysu.service.Interface.ISubjectService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Erisu
 * @date 2018/12/14 16:12
 * @Description 项目基本管理的实现
 * @Version 1.0
 **/
@Controller
public class SubjectServiceImpI implements ISubjectService {
    @Resource
    SubjectMapper subjectMapper;
    @Override
    public int addSubject(Subject subject) {
        return subjectMapper.insertSelective(subject);
    }

    @Override
    public int updateSubject(Subject subject) {
        return subjectMapper.updateByPrimaryKeySelective(subject);
    }

    @Override
    public List<Subject> showSubjects(SubjectExample subjectExample) {
        return subjectMapper.selectByExampleWithBLOBs(subjectExample);
    }

    @Override
    public int delSubject(int id) {
        return subjectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int countByExample(SubjectExample subjectExample) {
        return (int)subjectMapper.countByExample(subjectExample);
    }
}
