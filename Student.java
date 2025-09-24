package com.learning.unit1;

import java.util.ArrayList;

class Studentinfo{
	int id;
	String name;
	Double marks;
	Studentinfo(int id,String name,Double marks){
		add(id,name,marks);
	}
	public void add(int id,String name,Double marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public void view() {
		System.out.println("id : "+this.id);
		System.out.println("name : "+this.name);
		System.out.println("marks : "+this.marks);
		System.out.println();
	}
	public void update(Double marks) {
//		this.id=id;
//		this.name=name;
		this.marks=marks;
	}
	public void delete() {
		this.id=-1;
		this.name="Null";
		this.marks=0.0;
	}
	
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Studentinfo>students=new ArrayList<>();
		students.add(new Studentinfo(1,"Kartik",55.5));
		students.add(new Studentinfo(2,"Aman",95.0));
		students.get(0).view();
		students.get(0).update(65.5);
		students.get(0).view();
		students.get(1).delete();
		//remove deleted student from students
		for(int i=0;i<students.size();i++) {
			if(students.get(i).id==-1) {
				students.remove(i);
			}
		}
		System.out.println("Printing the list : \n");
		//printing all students data in the arraylist
		for(Studentinfo std:students) {
			std.view();
		}
		
		
		
	}

}
