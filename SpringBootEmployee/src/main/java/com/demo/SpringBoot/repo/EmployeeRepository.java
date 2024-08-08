package com.demo.SpringBoot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringBoot.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{
	
}
