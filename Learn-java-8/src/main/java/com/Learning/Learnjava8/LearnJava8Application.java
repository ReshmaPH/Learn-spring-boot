package com.Learning.Learnjava8;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class LearnJava8Application {  //PigeonGroup class

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnJava8Application.class, args);
		
	/*	Pigeon pigeon=context.getBean(Pigeon.class);
		pigeon.setAge(1);
		pigeon.setColor("white");
		pigeon.setName("Kukkoo");
		
		Pigeon pigeon2=context.getBean(Pigeon.class);
		pigeon2.setAge(2);
		pigeon2.setColor("white");
		pigeon2.setName("Neelu");  
		*/
		//Pigeon pigeon = (Pigeon) context.getBean("Kookoo");
		
		Pigeon pigeon1=new Pigeon("Kukkoo",1,"white");
		Pigeon pigeon2=new Pigeon("neelu",1,"white");
		Pigeon pigeon3=new Pigeon("Kukkoo",2,"Black");
		
		Street street=context.getBean(Street.class);
		street.setLandmark("Near to Temple");
		street.setLocality("Parappukkara");
		List<Pigeon> pigeonList=new ArrayList<>();
		pigeonList.add(pigeon1);
		pigeonList.add(pigeon2);
		pigeonList.add(pigeon3);
		
		//System.out.println(pigeonList);
		
		street.setPigeonList(pigeonList);
		System.out.println(street.getPigeonList());
		//street.getPigeonList().stream().filter(pigeons ->pigeons.getColor()=="white").forEach(System.out::println);
		//street.getPigeonList().stream().filter(pigeons ->pigeons.getColor()=="white").forEach(pigeons->System.out.println(pigeons.getName()));
		System.out.println("Names of white pigeons from the list : ");
		street.findWhitePigeons();
		
		street.removeWhitePigeons();
		
		
		
		
	}

}
