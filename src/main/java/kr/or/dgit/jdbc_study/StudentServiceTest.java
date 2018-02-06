package kr.or.dgit.jdbc_study;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.logging.log4j.core.util.Assert;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.jdbc_study.dto.Student;
import kr.or.dgit.jdbc_study.service.StudentService;

public class StudentServiceTest {
	private static StudentService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = StudentService.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		service= null;
	}

	@Test
	public void test() {
		List<Student> list = service.findAllStudent();
		Assert.isNonEmpty(list);
	}

}
