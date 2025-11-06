package com.khan.defaultMethods;

interface A{
	default void sayHello() {
		System.out.println("A sys Hello");
	}
}
interface B{
	default void sayHello() {
		System.out.println("B says hello");
	}
}

public class C implements A,B {
	public static void main(String[] args) {
		C c =new C();
		c.sayHello();
		
	}

	@Override
	public void sayHello() {
		//B.super.sayHello();//
		System.out.println("My own impl");
		
	}

}
