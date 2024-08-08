package com.org.day3;

class Bank
{
	private String BankName;
    private Employee[] employees;	
    private int employeeCount;
	
	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public String getBankName() {
		return BankName;
	}

	public Bank(int count)
	{
		employees=new Employee[count];
		employeeCount=count;
		for(int i=0;i<count;i++)
		{
			employees[i]=new Employee("Employee "+(i+1));
		}
	}
	
	public Employee getEmployee(int index)
	{
		if(index>=0 && index<employeeCount)
		{
			return employees[index];
		}
		else
		{
			return null;
		}
	}
	
	public int getEmployeeCount()
	{
		return employeeCount;
	}
	public Bank(String bankName) {
		super();
		BankName = bankName;
	}
	
}

class Employee
{
	private String EmpName;
	
	public Employee(String empName) {
		super();
		EmpName = empName;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}
	
}
public class AssociationTest {
//	static String a[]= {"venkatesh","chinna","aditya"};

	public static void main(String[] args) 
	{
		Bank bk=new Bank("SBI");
		Bank bank=new Bank(3);
		Employee em=new Employee("Pawan");
//		System.out.println(bk.getBankName());
		
		bank.getEmployee(0).setEmpName("john");
		bank.getEmployee(1).setEmpName("doe");
		bank.getEmployee(2).setEmpName("smith");
		for(int i=0;i<bank.getEmployeeCount();i++)
		{
			System.out.println("Employee "+(i+1) + ": "+bank.getEmployee(i).getEmpName());
		}
//		System.out.println(em.getEmpName());
		System.out.println(bank.getEmployee(0).getEmpName()+" is working in "+bk.getBankName());
		
	}
}
