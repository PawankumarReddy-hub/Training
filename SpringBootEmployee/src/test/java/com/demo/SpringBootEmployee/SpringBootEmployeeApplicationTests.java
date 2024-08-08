package com.demo.SpringBootEmployee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.SpringBoot.model.Employee;
import com.demo.SpringBoot.repo.EmployeeRepository;

@DataJpaTest
@SpringBootTest
class SpringBootEmployeeApplicationTests {
	
	@Autowired
	EmployeeRepository repo;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testSaveEmployee()
	{
		Employee emp=new Employee(123,"pawan",500000,"Java Developer");
		Employee savedEmployee=repo.save(emp);
		assertNotNull(savedEmployee);
		assertEquals("pawan",savedEmployee.getName());
	}
	
	@Test
	public void testGetEmployee()
	{
		Employee emp=repo.save(new Employee(124,"venkatesh",400000,"Java Developer"));
		Employee fetchEmployee=repo.findById(emp.getEmpid()).orElse(null);
		assertNotNull(fetchEmployee);
	}

}
