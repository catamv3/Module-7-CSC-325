/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab and Catamv3
 */
public abstract class Human {
    private String name;
	private String address;
	private int age;


	public Human(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {return address;}

	public void setAddress(String address){this.address = address;}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}