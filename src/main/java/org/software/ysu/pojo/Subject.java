package org.software.ysu.pojo;

public class Subject {
    private Integer subjectId;

    private String subjectName;

    private String subjectTeacher;

    private String subjectStudent;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public String getSubjectTeacher() {
        return subjectTeacher;
    }

    public void setSubjectTeacher(String subjectTeacher) {
        this.subjectTeacher = subjectTeacher == null ? null : subjectTeacher.trim();
    }

    public String getSubjectStudent() {
        return subjectStudent;
    }

    public void setSubjectStudent(String subjectStudent) {
        this.subjectStudent = subjectStudent == null ? null : subjectStudent.trim();
    }
}