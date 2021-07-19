package com.Learning.Learnjava8;
import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class Country {
	private String pm;
	private long population;
	private List<State> stateList=new ArrayList<>();
	
	
	/*
	public Country(String pm, long population, List<State> stateList) {
		super();
		this.pm = pm;
		this.population = population;
		this.stateList = stateList;
	} */



	public void print() {
		System.out.println("Welcome to the Country ");
	}
	
	
	
	
	
}
