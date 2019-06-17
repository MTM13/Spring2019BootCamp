package javaTest;

import java.util.Arrays;

public class CanvasPractice {

	public static void main(String[] args) {
		String []courses = {"Welcome Kit",
				"Online-Java programming",
				"Online-Software Development Lifecycle",
				"Online-Software QA Testing",
				"Online-Team Activity",
				"Online-Mentoring",
				"Online-Selenium",
				"Online-SQL",
				"Online-API Testing"};
		int[] courseID= {143,166,168,170,163,203,169,171,164};
//		for (int i = 0; i < courses.length; i++) {
//			System.out.println("the courseID for <"+courses[i]+">is<"+courseID[i]+">");
//			
//			if(courses[i].equals("Online-SQL")) {
//				System.out.println("index is"+courseID[i]);
//--------------------------------------------------------------------				
//				for (int j = 0; j < courseID.length; j++) {
//					
//				if(courseID[j]==203) {
//					System.out.println("couse name is"+courses[j]);
//				}
//--------------------------------------------------------------------
		int count=0;
		for (int i = 0; i < courses.length; i++) {
			if(courses[i].contains("Software")) {
				
				count++;
		}
			
		
		
				}
				
		System.out.println(count);
			
			
		}
	
	}


