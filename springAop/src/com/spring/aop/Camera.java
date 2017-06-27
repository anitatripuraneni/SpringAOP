package com.spring.aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component("camera")
public class Camera {
	
	public void snap() throws Exception{
		System.out.println("SNAP");
		 new Exception("bye bye");
	}
	
	public void snap(int exposure){
		System.out.println("snap exposure: "+ exposure);
	}
	
	public void snap(String name){
		System.out.println("snap name: "+name);
	}

	public String snap1(String name){
		return name;
}
	
	public void snapNighttime(){
	System.out.println("snap at night time");	
	}
}
