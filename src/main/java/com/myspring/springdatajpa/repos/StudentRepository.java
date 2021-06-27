package com.myspring.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myspring.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
