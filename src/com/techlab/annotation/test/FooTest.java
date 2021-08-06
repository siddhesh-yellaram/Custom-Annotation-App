package com.techlab.annotation.test;

import java.lang.reflect.*;

import com.techlab.annotation.Foo;
import com.techlab.annotation.UnitTestCase;

public class FooTest {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		doReflection(Foo.class);
	}

	private static void doReflection(Class<?> c)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] methods = c.getMethods();
		int trueCount = 0;
		int falseCount = 0;
		try {
			for (Method m : methods) {
				if (m.getAnnotation(UnitTestCase.class) != null) {
					if ((boolean) m.invoke(null)) {
						trueCount += 1;
					} else {
						falseCount += 1;
					}
				}
			}
		} catch (NullPointerException e) {
			e.getMessage();
		}
		int totalCount = trueCount + falseCount;
		System.out.println("pass count: " + trueCount);
		System.out.println("fail count: " + falseCount);
		System.out.println("total count: " + totalCount);
	}
}
