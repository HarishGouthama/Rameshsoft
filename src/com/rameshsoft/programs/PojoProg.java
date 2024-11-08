package com.rameshsoft.programs;

public class PojoProg
{
	private int practHrs;
	private String res;
	private String CompanyName;
	private double sal;
	
	public int getPracthrs()
	{
		return practHrs;
	}
	
	public void setPractHrs(int practHrs)
	{
		this.practHrs = practHrs;
	}
	
	public String getRes()
	{
		return res;
	}
	
	public void setRes(String res)
	{
		this.res = res;
	}
	
	public String getCompanyName()
	{
		return CompanyName;
	}
	
	public void setCompanyName(String CompanyName)
	{
		this.CompanyName = CompanyName;
	}
	
	public double getSal()
	{
		return sal;
	}
	
	public void setSal(double sal)
	{
		this.sal = sal;
	}
	
	public void Display()
	{
		System.out.println(practHrs + " = " + res + " = " + sal + " = " + CompanyName);
	}
}


class PojoTest{
	public static void main(String[] args) {
		PojoProg Pojo = new PojoProg();
		Pojo.setPractHrs(18);
		Pojo.setRes("JOB");
		Pojo.setCompanyName("HarishSoftwareConsultants");
		Pojo.setSal(155000);
		System.out.println(Pojo.getPracthrs());
		System.out.println(Pojo.getRes());
		System.out.println(Pojo.getCompanyName());
		System.out.println(Pojo.getSal());
		Pojo.Display();
	}
}