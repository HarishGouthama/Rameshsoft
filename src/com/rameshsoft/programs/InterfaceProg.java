package com.rameshsoft.programs;

@FunctionalInterface
interface Bank
{
	void hardwork();
	public static void accountCreation()
	{
		System.out.println("ISM : Account Creation");
	}
	
	default void practice()
	{
		System.out.println("DIM : Practice");
	}
}
interface BankATM
{
	String name = "Axis Bank";   //Public static final
	double balEnq();             // public abstract
	void pinChange(); 			 // public abstract
	public abstract double cashWithdraw();
	public abstract double cashDeposit();
	public void ministmt(); // abstract
	
	public static void accountCreation()
	{
		System.out.println("ISM : Account Creation");
	}
	
	default void practice()
	{
		System.out.println("DIM : Practice");
	}
	
	default void hello()
	{
		System.out.println("Hello");
	}
	
	private static void job1()
	{
		System.out.println("JOB1");
	}
	
	private void job2()
	{
		System.out.println("JOB2");
	}
	
	default void job3()
	{
		job1();
		job2();
	}
}

abstract class BankATMIMPL implements BankATM
{	
	@Override
	public void pinChange()
	{
		System.out.println("Pin Change");
	}
	
	@Override
	public double cashWithdraw()
	{
		System.out.println("Cash Withdraw");
		return 25000;
	}
	
	@Override
	public double cashDeposit() {
		System.out.println("Cash Deposit");
		return 250000000;
	}
	
	@Override
	public void ministmt()
	{
		System.out.println("Mini Statement");
	}
	
	public void bankName()
	{
		System.out.println("Axis Bank");
	}

	
	
}
public class InterfaceProg extends BankATMIMPL {
	@Override
	public double balEnq() {
		System.out.println("Bal Enq");
		return 1500000;

	}
	public static void main(String[] args) {
		
		BankATM atm = new InterfaceProg();
		atm.balEnq();
		atm.cashDeposit();
		atm.cashWithdraw();
		atm.ministmt();
		atm.pinChange();
		BankATM.accountCreation();
		atm.practice();
		atm.hello();   
		
		InterfaceProg prog = new InterfaceProg();
		prog.balEnq();
		prog.bankName();
		prog.cashDeposit();
		prog.cashWithdraw();
		prog.ministmt();
		prog.pinChange();
		
		//String nameResp = prog.name;
		//System.out.println(nameResp);
		
		String nameResp1 = BankATM.name;
		System.out.println(nameResp1);
	}
}
