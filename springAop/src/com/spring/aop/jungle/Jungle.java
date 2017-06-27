package com.spring.aop.jungle;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Jungle {
	@Pointcut("within(@Deprecated com.spring.aop.jungle.*)")
	public void saphari() {

	}

	@Pointcut("target(@Deprecated com.spring.aop.jungle.Zoo)")
	public void forestRide() {

	}
	
	@Pointcut("this(com.spring.aop.jungle.Saphari)")
	public void thisRide() {

	}

	@Before("saphari()")
	public void forest() {
		System.out.println("All animals leave happily in jungle");
	}

	@Before("forestRide()")
	public void forest1() {
		System.out.println("All animals in target");
	}
	
	@Before("thisRide()")
	public void thisFroest() {
		System.out.println("All animals in this demo");
	}
}
