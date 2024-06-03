package com.kmss.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kmss.springboot.entity.Employee;

public interface MyRepository extends JpaRepository<Employee, Integer> {

	//Employee findById(int Id);
}
