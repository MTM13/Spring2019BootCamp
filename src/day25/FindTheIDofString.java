package day25;

import java.util.Arrays;

public class FindTheIDofString {

	public static void main(String[] args) {
		String [] courses = {"Welcome Kit", 
				 "Online-Java Programming", 
				 "Online-Software Development Lifecycle",
				 "Online-Software QA Testing", 
				 "Online-Team Activity",
				 "Online-Mentoring",
				 "Online-Selenium",
				 "Online-SQL",
				 "Online-API Testing"};
		 
		 int[] courseID = {143,166,168,170,163,203,169,171,164};
			//find out the ID of Online Java Programming course
		
		 
//		 for (int i = 0; i < courses.length; i++) {
//			 if(courses[i].equals("Online-SQL")) {
//				 System.out.println("the ID of Online-SQL is "+courseID[i]);
//			 }
//			
//		}
		 //find out the course name of 203
		 // count the courses that contains Software
		 int count =0;
		 for (int i = 0; i < courseID.length; i++) {
			 if(courses[i].contains("Software")) {
				 count++;
			 }if(courseID[i]==203) {
				System.out.println(courses[i]+" "+ count);
			}
		}
				 
				 
				 
				 
				 
			}
			
		}

		 



