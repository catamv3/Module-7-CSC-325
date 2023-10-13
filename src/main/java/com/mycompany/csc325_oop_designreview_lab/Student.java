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
     *
     * @param name - name
     * @param age  - age
     */
    public Student(String name, int age) {
        //provide the address for students as FSC.
        super(name, age, "2350 NY-110, Farmingdale, NY 11735");
        this.gpa = 0.0;
    }


    /**
     * getter method for gpa
     *
     * @return gpa
     */
    protected double getGPA() {
        return gpa;
    }

    /**
     * setter method for gpa
     *
     * @param gpa
     */
    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        String str = "";

        str = String.format("Name: %s\nAge: %d\nAddress: %s\nGPA: %.2f", getName(), getAge(), super.getAddress(), getGPA());
        return str;

        // ToDo 4: Add comments to your code
    } //end class


}

/**
 * this class stores informaiton regarding a freshman object, child of student class
 * @author CATAMV3
 */
class Freshman extends Student {
    //private memebr field for credits
    private int credits;

    /**
     * parameterized freshman constructor that accepts name age and credits
     * @param name
     * @param age
     * @param credits
     */
    public Freshman(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    /**
     * getter method for credits
     * @return credits
     */
    protected int getCredits() {
        return credits;
    }

    /**
     * Setter method for credits
     * @param credits
     */
    private void setCredits(int credits) {
        this.credits = credits;
    }


    /**
     * this method overrides the parent to string method and returns a string formatted
     * to show name age address gpa and number of credits.
     * @return string containing freshman informaiton.
     */
    @Override
    public String toString() {
        String str = "";

        str = String.format("Freshman Name: %s\nAge: %d\nAddress: %s\nGPA; %.2f\n,Credits: %d", getName(), getAge(), super.getAddress(), getGPA(), getCredits());
        return str;
    }


} //close freshman class


/**
 * this class stores informaiton regarding a Senior object, child of student class
 * @author CATAMV3
 */
class Senior extends Student {

    //private memebr field for credits
    private int credits;


    /**
     * parameterized senior constructor that accepts name age and credits
     * @param name
     * @param age
     * @param credits
     */
    public Senior(String name, int age, int credits) {
        super(name, age);
        this.credits = 85;
    }

    /**
     * getter method for credits
     * @return credits
     */
    protected int getCredits() {
        return credits;
    }

    /**
     * Setter method for credits
     * @param credits
     */
    private void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * this method overrides the parent to string method and returns a string formatted
     * to show name age address gpa and number of credits.
     * @return string containing senior informaiton.
     */
    @Override
    public String toString() {
        String str = "";

        str = String.format("Senior Name: %s\nAge: %d\nAddress: %s\nGPA; %.2f\n,Credits: %d", getName(), getAge(), super.getAddress(), getGPA(), getCredits());
        return str;
    }

} //clsoe senior class


