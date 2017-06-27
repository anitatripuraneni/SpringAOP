package com.spring.aop.camera.accessiores;

import org.springframework.stereotype.Component;

@Component
public class Lens {
	
	public void zoom(int factor){
		System.out.println("Zooming lens from camera package: "+factor);
	}

}
