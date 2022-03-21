package org.taskthree.java;

interface Test{
	public void msg();
}
public class AnonymousInnerClass  {

	public static void main(String[] args) {
		Test t1=new Test() {
			public void msg() {
				System.out.println("Display");
			}
		};
		t1.msg();
	}
}
