package com.rameshsoft.programs;

class FpMen
{
	public void login() {
		System.out.println("Customer login");
		;;;;;;;;;;;
	}
	
	public void clothes() {
		System.out.println("Men Clothes");
		;;;;;;;;;;;
	}
	
	public void logout()
	{
		System.out.println("Customer logout");
		;;;;;;;
	}
}
	
class FpWomen extends FpMen
{
	public void sarees()
	{
		System.out.println("Sarees");
	}
	
	public void goldJewellery()
	{
		System.out.println("Gold and Jewellery");
	}
}


class Fpkids extends FpWomen
{
	public void toys()
	{
		System.out.println("Toys");
		;;;;;;;;;;
	}
}
public class FlipKartProg {
	public static void main(String[] args) {
		//1.Create Parent class Object
		/*FpMen fpmen = new FpMen();
		fpmen.login();
		fpmen.clothes();
		fpmen.logout();*/
		
		
		//2. Create Child class Objects.
		/*FpWomen fpwomen = new FpWomen();
		fpwomen.login();
		fpwomen.clothes();
		fpwomen.goldJewellery();
		fpwomen.sarees();
		fpwomen.logout();*/
		
		/*Fpkids fpkids = new Fpkids();
		fpkids.login();
		fpkids.clothes();
		fpkids.goldJewellery();
		fpkids.sarees();
		fpkids.toys();
		fpkids.logout();*/
		
		//3. Create child class object by using parent class
		
		FpMen fpMen = new FpWomen();
		fpMen.login();
		fpMen.clothes();
		fpMen.logout();	
		
		
	}
}
