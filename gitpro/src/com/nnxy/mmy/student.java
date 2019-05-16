package com.nnxy.mmy;

public class student {
	private int age;
	private int sex;
	private  String name;
	
	
	
	@Override
	public String toString() {
		return "student [age=" + age + ", sex=" + sex + ", name=" + name + "]";
	}

	public student(int age, int sex, String name) {
		super();
		this.age = age;
		this.sex = sex;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
