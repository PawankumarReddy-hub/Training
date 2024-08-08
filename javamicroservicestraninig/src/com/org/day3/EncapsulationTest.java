package com.org.day3;

class Student
{
	private String Sname;
	private String SRollNo;
	private String SId;
	int SFee;
	
	Student(String sname, String sRollNo, String sId, int sFee) {
		this.Sname = sname;
		this.SRollNo = sRollNo;
		this.SId = sId;
		this.SFee = sFee;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSRollNo() {
		return SRollNo;
	}
	public void setSRollNo(String sRollNo) {
		SRollNo = sRollNo;
	}
	public String getSId() {
		return SId;
	}
	public void setSId(String sId) {
		SId = sId;
	}
}

public class EncapsulationTest {

	public static void main(String[] args) 
	{
		Student student=new Student("rajasekhar","570","70",25000);
		System.out.println(student.getSname()+" "+student.getSRollNo()+" "+student.getSId()+" "+student.SFee);

	}

}
