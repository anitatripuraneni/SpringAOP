package com.spring.aop.jungle;

import org.springframework.stereotype.Component;

@Component
public class Zoo implements Saphari {
	
	public void tiger(){
		System.out.println("tiger sleeping in the zoo");
	}
	
	public void lion(int i){
		System.out.println("Lion enjoying the walk");
	}
	
	public void bear(String name){
		System.out.println(name+" eating food in the bowl");
	}

}
