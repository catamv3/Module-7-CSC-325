/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * This class stores information for a Student Object, a child class of Human.
 * @author MoaathAlrajab and Catamv3
 */
public class Student extends Human {
	// ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors
    //member field for GPA
    private double gpa;
	// ToDo 3: Add a field for GPA and create a setter and a getter

    /**
     * Constructor for a student object that accepts three parameters, name gpa and age
     * @param name - name
     * @param age - age
     * @param gpa - gpa
     */
    public Student(String name,int age, double gpa){
        //provide the address for students as FSC.
        super(name,age, "2350 NY-110, Farmingdale, NY 11735");
        this.gpa = gpa;
    }


    /**
     * getter method for gpa
     * @return gpa
     */
    protected double getGPA() {
        return gpa;
    }

    /**
     * setter method for gpa
     * @param gpa
     */
    private void setGpa(double gpa) {
        this.gpa = gpa;
    }


    // ToDo 4: Add comments to your code
} //end class
