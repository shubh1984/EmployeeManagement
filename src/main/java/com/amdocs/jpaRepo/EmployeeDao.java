package com.amdocs.jpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdocs.Entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Long> {
	

}
