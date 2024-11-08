package com.rameshsoft.seleniumjava;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LombokProg {
	
	private int practHrs;
	private String res;
	private double sal;
	private float hike;
	@Getter @Setter static private String name;	
	
	

	public static void main(String[] args) {
		LombokProg prog = new LombokProg();
		//LombokProg prog1 = new LombokProg(practHrs, res, sal, hike);
		
		prog.setPractHrs(9);
		prog.setRes("Job");
		prog.setSal(145000);
		prog.setHike(255000);
		prog.setName("Software");
		
		System.out.println(prog.getPractHrs());
		System.out.println(prog.getRes());
		System.out.println(prog.getSal());
		System.out.println(prog.getHike());
		System.out.println(prog.getName());		
		
	}
}
