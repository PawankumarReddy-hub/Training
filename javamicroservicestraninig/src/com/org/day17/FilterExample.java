package com.org.day17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
class Employee
{
    public Employee(Long id)
    {
        this.id=id;
    }
    private Long id;
    
    public Long getId()
    {
        return id;
    }
    
    public void setId(Long id)
    {
        this.id=id;
    }
}
public class FilterExample
{
	public static void main(String[] args) {
	    List<Employee> number=new ArrayList<>();
	    number.add(new Employee(1L));
	    number.add(new Employee(2L));
	    number.add(new Employee(3L));
	    number.add(new Employee(4L));
	    number.add(new Employee(5L));
	    number.add(new Employee(6L));
	    List ids=number.stream().filter(e->e.getId()>3L).map(e->e.getId()).collect(Collectors.toList());
	    System.out.println(ids);
	}
}


