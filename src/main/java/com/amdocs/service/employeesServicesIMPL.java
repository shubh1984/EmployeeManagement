package com.amdocs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.Entities.Employee;
import com.amdocs.jpaRepo.EmployeeDao;

@Service
	public class employeesServicesIMPL implements employeeServices {
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getEmployees() {
	return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(long id) {
	return employeeDao.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee Employee) {
	employeeDao.save(Employee);
	return Employee;
	}

	@Override
	public Employee addEmployee(Employee Employee) {
	employeeDao.save(Employee);
	return Employee;
	}

	@Override
	public void deleteEmployee(long parseLong) {
	Employee entity = employeeDao.getOne(parseLong);
	employeeDao.delete(entity);
	}
	}


