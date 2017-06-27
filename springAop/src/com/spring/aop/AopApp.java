package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.camera.accessiores.Lens;

public class AopApp {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/aop/beans/aopbeans.xml");
		Camera cam =(Camera)con.getBean("camera");
		Lens lens=(Lens)con.getBean("lens");
		try {
			cam.snap();
		} catch (Exception e) {
			System.out.println("caught exception:" +e.getMessage());
		}
		cam.snap(100);
		cam.snap("Anita");
		System.out.println(cam.snap1("Sumanth"));
		cam.snapNighttime();
		lens.zoom(10);
		((ClassPathXmlApplicationContext)con).close();

	}

}
