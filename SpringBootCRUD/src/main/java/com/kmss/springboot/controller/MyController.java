package com.kmss.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kmss.springboot.entity.Employee;
import com.kmss.springboot.service.MyService;

@RestController
@RequestMapping("/api")
public class MyController {
	
	private final MyService myService;
	
	@Autowired
	public MyController(MyService myService)
	{
		this.myService = myService;
	}
	
	//Creating....
	@PostMapping("/insert")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return myService.saveData(employee);
	}
	
	//Read data....
	@PutMapping("/read")
	public List<Employee> getAllEmployees()
	{
		return myService.getAllEmpData();
	}
	
	//Updating....
	@PutMapping("/user/{id}")
	public Employee updateEmployee(@PathVariable int id)
	{
		return myService.updateEmpData(id, null);

	}
	
	//Deleting....
	@DeleteMapping("/user/{id}")
	public void deleteEmployee(@PathVariable int id)
	{
		 myService.deleteEmployee(id);
	}
}