package com.Learning.Learnjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Street {
private String locality;
private String landmark;
@Autowired
private List<Pigeon> pigeonList=new ArrayList<>();

public  void findWhitePigeons() {
	pigeonList.stream().filter(pigeons ->pigeons.getColor()=="white").forEach(pigeons->System.out.println(pigeons.getName()));
}

public void removeWhitePigeons() {
	pigeonList.removeIf(pigeons ->pigeons.getColor()=="white");
	System.out.println("List of Pegions after removing the white ones "+pigeonList);	
}

public String getLocality() {
	return locality;
}
public void setLocality(String locality) {
	this.locality = locality;
}
public String getLandmark() {
	return landmark;
}
public void setLandmark(String landmark) {
	this.landmark = landmark;
}
public List<Pigeon> getPigeonList() {
	return pigeonList;
}
public void setPigeonList(List<Pigeon> pigeonList) {
	this.pigeonList = pigeonList;
}
@Override
public String toString() {
	return "Street [locality=" + locality + ", landmark=" + landmark + ", pigeonList=" + pigeonList + "]";
}





}
