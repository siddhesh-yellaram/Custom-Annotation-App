package com.techlab.annotation;

public class Foo {
	@UnitTestCase
	public boolean m1() {
		return true;
	}
	
	@UnitTestCase
	public boolean m2() {
		return false;
	}
	
	@UnitTestCase
	public boolean m3() {
		return true;
	}
	
	public boolean m4() {
		return false;
	}
}
