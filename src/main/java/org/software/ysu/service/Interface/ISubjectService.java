package org.software.ysu.service.Interface;

import org.software.ysu.pojo.Subject;
import org.software.ysu.pojo.SubjectExample;

import java.util.List;

/**
 * @author Erisu
 * @date 2018/12/14 16:11
 * @Description 项目的基本管理
 * @Version 1.0
 **/
public interface ISubjectService {
    public int addSubject(Subject subject);
    public int updateSubject(Subject subject);
    public List<Subject> showSubjects(SubjectExample subjectExample);
    public int delSubject(int id);
    public int countByExample(SubjectExample subjectExample);
}
