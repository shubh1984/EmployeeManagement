package com.amdocs.service;

import java.util.List;

import com.amdocs.Entities.Employee;

public interface employeeServices {
		public List<Employee> getEmployees();
		public Employee getEmployee(long id);
		public Employee addEmployee(Employee employee);
		public Employee updateEmployee(Employee employee);
		public void deleteEmployee(long parseLong);
		}


