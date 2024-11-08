package com.rameshsoft.programs;

public class LangPkgProg {
	
	int hcNum;
	
	public LangPkgProg(int hcNum)
	{
		this.hcNum = hcNum;
	}
	
	@Override
	public int hashCode()
	{
		return hcNum;
	}
	public String toString()
	{
		return "Job";
	}
	
	public static void main(String[] args) {
		
		
		LangPkgProg prog = new LangPkgProg(140691);
		int hc = prog.hashCode();
		System.out.println(hc);
		
		LangPkgProg prog1  = new LangPkgProg(456456);
		int hc1 = prog1.hashCode();
		System.out.println(hc1);
		
		String str = prog.toString();
		System.out.println(str);
		
		String className = prog.getClass().getName();
		System.out.println(className);
	}
}
