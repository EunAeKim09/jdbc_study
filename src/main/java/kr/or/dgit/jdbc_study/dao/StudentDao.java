package kr.or.dgit.jdbc_study.dao;

import java.util.List;

import kr.or.dgit.jdbc_study.dto.Student;

public interface StudentDao {
	Student findStudentById(int studId);
	void insertStudent (Student student);
	void deleteStudent (int student);
	List<Student> findAllStudent();
}
