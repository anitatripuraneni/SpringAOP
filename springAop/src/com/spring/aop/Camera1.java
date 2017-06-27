package com.spring.aop;

import org.springframework.stereotype.Component;

@Component("camera2")
public class Camera1 implements Photo,Machine {
	
	public Camera1(){
		System.out.println("Hello from Camera1 constructor");
	}
	
	public void snap() throws Exception{
		System.out.println("SNAP");
		 throw new Exception("bye bye");
	}
	

}
