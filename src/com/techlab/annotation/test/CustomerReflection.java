package com.techlab.annotation.test;

import java.lang.reflect.Method;
import com.techlab.annotation.Customer;
import com.techlab.annotation.NeedToBeRefactor;

public class CustomerReflection {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		doReflection(Customer.class);
	}

	private static void doReflection(Class<?> c){
		Method[] methods = c.getMethods();
		System.out.println("\nMethods with Annotation Class "+c.getName()+" are: ");
		for(Method m : methods){
			if(m.getAnnotation(NeedToBeRefactor.class) != null) {
				System.out.println(m.getName());
			}
		}
	}
}
