/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * This abstract class stores information for a human object
 * @author MoaathAlrajab and Catamv3
 */
public abstract class Human { //open class
	//member variables include name address and age
    private String name;
	private String address;
	private int age;


	/**
	 * parameterized constructor for human object that accepts a name age and address
	 * @param name
	 * @param age
	 * @param address
	 */
	public Human(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}


	/**
	 * getter method for name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter method for name
	 * @param name name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter method for address
	 * @return address
	 */
	public String getAddress() {return address;}

	/**
	 * setter method for address
	 * @param address
	 */
	public void setAddress(String address){this.address = address;}


	/**
	 * getter method for age
	 * @return age
	 */
	public int getAge() {return age;}

	/**
	 * Setter method for age
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
}//close class