package org.taskone.java;

//1. Implement one-many association for Company and Employee.(Make sure to have rating,startYear for Employee)


public class OneToMany {

	public static void main(String[] args) {
		Company com=new Company("Techouts","Hyd");
		Employee emp1=new Employee(100,"virat",5,2008);
		Employee emp2=new Employee(101,"rohit",5,2007);
		System.out.println("these two employees are worked in the same company ");
		System.out.println(com.name+" "+com.address+" "+emp1.empName+" "+emp1.id+" "+emp1.rating+" "+emp1.startYear);
		System.out.println(com.name+" "+com.address+" "+emp2.empName+" "+emp2.id+" "+emp2.rating+" "+emp2.startYear);

	}

}
