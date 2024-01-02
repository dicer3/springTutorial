package com.springorm.hibernate.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springorm.hibernate.entities.Answer;
import com.springorm.hibernate.entities.Emp;
import com.springorm.hibernate.entities.Project;
import com.springorm.hibernate.entities.Question;
import com.springorm.hibernate.entities.Student;


public class StudentDao {

    private HibernateTemplate hibernateTemplate;
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    @Transactional
    public int insert(Student student) {
        return (Integer)this.hibernateTemplate.save(student);
    }

    @Transactional
    public int insertQuestion(Question question) {
        return (Integer)this.hibernateTemplate.save(question);
    }

    @Transactional
    public int insertAnswer(Answer answer) {
        return (Integer)this.hibernateTemplate.save(answer);
    }

    @Transactional
    public int insertEmp(Emp emp) {
        return (Integer)this.hibernateTemplate.save(emp);
    }

    @Transactional
    public int insertProject(Project project) {
        return (Integer)this.hibernateTemplate.save(project);
    }

    public Student getStudent(int studentId) {
        return this.hibernateTemplate.get(Student.class, studentId);
    }

    public List<Student> getAllStudents() {
        return (List<Student>)this.hibernateTemplate.loadAll(Student.class);
    }

    @Transactional
    public void deleteStudent(int studentId) {
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        this.hibernateTemplate.delete(student);
    }

    @Transactional
    public void updateStudent(Student student){
          this.hibernateTemplate.saveOrUpdate(student);
    }
}
