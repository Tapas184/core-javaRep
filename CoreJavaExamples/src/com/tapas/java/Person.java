package com.tapas.java;

public class Person {
private String name;
private Double age;
private String gender;
private String deptno;

public Person(String name, Double age, String gender, String deptno) {
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.deptno = deptno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getAge() {
	return age;
}
public void setAge(Double age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDeptno() {
	return deptno;
}
public void setDeptno(String deptno) {
	this.deptno = deptno;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", deptno=" + deptno + "]";
}

}//
