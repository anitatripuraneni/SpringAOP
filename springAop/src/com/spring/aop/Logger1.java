package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger1 {
	
	@Pointcut("execution(* *.*(..))")
	public void advice(){
		
	}
@After("advice()")
public void AfterAdvice(){
	System.out.println("After advice...");
}

@AfterReturning("advice()")
public void AfterAdvice1(){
	System.out.println("After Returning advice...");
}

@AfterThrowing("advice()")
public void AfterAdvice2(){
	System.out.println("After throwing advice...");
}

@Around("advice()")
public void AfterAdvice3(ProceedingJoinPoint p){
	System.out.println("Around advice(before)...");
	
	try {
		p.proceed();
	} catch (Throwable e) {
		System.out.println("in Around advice catch block:"+e.getMessage());
}
	
	System.out.println("Around advice(after)....");
}
}
