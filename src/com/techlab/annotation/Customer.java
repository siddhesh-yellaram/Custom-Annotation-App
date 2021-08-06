package com.techlab.annotation;

public class Customer {
	@NeedToBeRefactor
	public void m1(){
		System.out.println("Inside Method M1");
	}
	
	public void m2(){
		System.out.println("Inside Method M2");
	}
	
	public void m3(){
		System.out.println("Inside Method M3");
	}
	
	@NeedToBeRefactor
	public void m4(){
		System.out.println("Inside Method M2");
	}
}
