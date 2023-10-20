package com.amdocs.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.Entities.Employee;
import com.amdocs.service.employeeServices;

@RestController
	public class MyController {
	@Autowired
	private employeeServices cs;
	@GetMapping("/home")
	public String home() {
	return "Welcome to employee application";
	}

	@GetMapping("/employee")
	public List<Employee> getCourse(){
	return this.cs.getEmployees();

	}

	@GetMapping("/employee/{id}")
	public Employee getCourse(@PathVariable String id){
	return this.cs.getEmployee(Long.parseLong(id));

	}

	@PostMapping("/employee")

	public Employee addEmployee(@RequestBody Employee employee) {
	return this.cs.addEmployee(employee);

	}

	@PutMapping("/employee")

	public Employee updateEmployee(@RequestBody Employee employee) {
	return this.cs.updateEmployee(employee);

	}

	@DeleteMapping("/employee/{id}")

	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String id){
	try {

	this.cs.deleteEmployee(Long.parseLong(id));
	return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {

	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

	}

	}

	}


