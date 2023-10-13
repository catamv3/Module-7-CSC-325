/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 * This class contains the main method for the program for Module 5.
 *
 * @author MoaathAlrajab and Catamv3
 */
public class MainClass { //open class

    /**
     * main method for the program.
     *
     * @param args
     */
    public static void main(String[] args) { //open main
        // ToDo 5: Fix the error

        // ToDo 6: Fix the constructor of the Student class

        // Todo 7: Create two classes for Freshman and Senior

        // ToDo 8: The senior class should have a minimum of 85 credits

        // ToDo 9: Add a toString method for the Student class
        // ToDo 10: Add a toString method for the Freshman class

        // ToDo 11: Add a toString method for the Senior class
		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.

		//declare a student object
		Student std1 = new Student("James", 20);

		//declare student object of type freshman
		Student fre1 = new Freshman("Mike", 20, 0); // name, age, credits

		//declare student object of type senior
		Student snr1 = new Senior("John", 30, 90);

		//create a scanner object and prompt the user 3 times for a GOA for each student
		//Assign the gpa to the student after each prompt.
		Scanner scnr = new Scanner(System.in);
        System.out.println("What is the GPA of the first student?");
        std1.setGpa(Double.parseDouble(scnr.nextLine()));
        System.out.println("What is the GPA of the second student?");
        fre1.setGpa(Double.parseDouble(scnr.nextLine()));
        System.out.println("What is the GPA of the third student?");
        snr1.setGpa(Double.parseDouble(scnr.nextLine()));

		//print the data of the three students.
        System.out.println(std1);
        System.out.println(fre1);
        System.out.println(snr1);

        // ToDo 13: add comments and explain your code

        // ToDo 14: submit using a pull request.
    }//close main


}//close class



