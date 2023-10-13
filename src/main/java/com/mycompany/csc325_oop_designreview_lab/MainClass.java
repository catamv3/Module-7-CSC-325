/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

                // Todo 7: Create two classes for Freshman and Senior 

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 9: Add a toString method for the Student class
		// ToDo 10: Add a toString method for the Freshman class

		Student std1= new Student("James", 20);
                // ToDo 11: Add a toString method for the Senior class

		Freshman std1= new Student("James", 20, 12); // name, age, credits

                Senior std2 = new Student("John", 30, 90);

		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.

		System.out.println(std1);

                System.out.println(std2);

		// ToDo 13: add comments and explain your code

		// ToDo 14: submit using a pull request.
	}

	public class Freshman extends Student{
	 private int credits;
	 public Freshman(String name, int age, int credits){
			super(name, age, 0.0);
			this.credits=credits;
		}

		protected int getCredits(){return credits;}

		private void setCredits(int credits){this.credits = credits;}

		@Override
		public String toString() {
			String str = "";

			str = String.format("%s\n%.2f\n", getName(), getAge(),getAddress(),getGPA());
			return str;
		}


	}

	public class Senior extends Student{
		private int credits;
		public Senior(String name, int age, int credits){
			super(name, age, 0.0);
			this.credits=credits;
		}
	}

}

