package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopApp1 {

	public static void main(String[] args) {
ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/aop/beans/aopbeans.xml");

Object obj=con.getBean("camera2");
System.out.println("camera bean:"+obj.getClass());
System.out.println(obj instanceof Photo);


/*Camera1 cam = (Camera1)con.getBean("camera1");
try {
	cam.snap();
} catch (Exception e) {
	System.out.println("caught exception:" +e.getMessage());
}

	}*/
	}
}
