package com.Learning.Learnjava8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Pigeon {
private String name;
private int age;
//private String address;
private String color;



public Pigeon(String name, int age, String color) {
	super();
	this.name = name;
	this.age = age;
	this.color = color;
}


public Pigeon() {
	
}


public void print() {
	System.out.println("Pigeon name: "+name+" and color "+color);
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}


@Override
public String toString() {
	return "Pigeon [name=" + name + ", age=" + age + ", color=" + color + "]";
}


}
