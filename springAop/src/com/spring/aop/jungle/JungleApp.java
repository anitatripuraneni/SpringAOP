package com.spring.aop.jungle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JungleApp {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/aop/beans/aopbeans.xml");
		Zoo z =(Zoo)con.getBean("zoo");
		z.tiger();
		z.lion(3);
		z.bear("Mogli");
		
		BrazlianForest b = (BrazlianForest)con.getBean("brazlianForest");
		b.deepForest();

	}

}
