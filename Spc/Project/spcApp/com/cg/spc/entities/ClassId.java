package com.cg.spc.entities;

import java.util.List;

public class ClassId {
	private String classId;
	private int grade;
	private char division;
	private Teacher classTeacher;
	private List<Teacher> subjectTeachers;
	
	
	ClassId(int grade,char division){
		this.grade =  grade;
		this.division = division;
		this.classId =  ""+this.grade+this.division;
		
	}
	
	
	
	@Override
	public String toString() {
		return "ClassesAlloted [classId=" + classId + "]";
	}



	public static void main(String[] args) {
		
		ClassId ca = new ClassId(3, 'a');
		System.out.println(ca);
	}
}
