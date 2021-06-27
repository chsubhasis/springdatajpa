package com.myspring.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.myspring.springdatajpa.entities.Student;
import com.myspring.springdatajpa.repos.StudentRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	StudentRepository repos;

	@Test
	void testSave() {
		Student myst = new Student();
		myst.setId(1);
		myst.setName("babloo");
		myst.setTestScore(100);
		repos.save(myst);

		myst = new Student();
		myst.setId(2);
		myst.setName("babloo11");
		myst.setTestScore(100);
		repos.save(myst);
		
		assertEquals(repos.findAll().get(0).getName(), "babloo");
		System.out.println(repos.findAll().get(0).getName());
	}

}
