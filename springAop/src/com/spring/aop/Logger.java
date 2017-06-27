package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("logger")
//@Aspect
public class Logger {
	@Pointcut("execution(void com.spring.aop.Camera.snap(..))")
	public void cameraSnap(){
		
	}
	@Pointcut("execution(void com.spring.aop.Camera.snap(String))")
	public void cameraSnapName(){
		
	}
	@Pointcut("execution(String com.spring.aop.Camera.snap1(String))")
	public void cameraSnapNameWithReturn(){
		
	}
	@Pointcut("execution(* com.spring.aop.*.*(..))")
	public void cameraSnap1(){
		
	}
	
	@Pointcut("execution(* *.*(..))")
	public void cameraSnap2(){
		
	}
	@Before("cameraSnap()")
	public void aboutToTakePhoto() {
		System.out.println("About to take photo");
	}
	@Before("cameraSnapName()")
	public void aboutToTakePhotoWithName() {
		System.out.println("About to take photo with name");
	}
	@Before("cameraSnapNameWithReturn()")
	public void aboutToTakePhotoWithNameWithReturn() {
		System.out.println("About to take photo with name with return");
	}

	@Before("cameraSnap1()")
	public void aboutToTakePhoto1() {
		System.out.println("About to take photo");
	}
	@Before("cameraSnap2()")
	public void aboutToTakePhoto2() {
		System.out.println("About to take photo from Lens class");
	}
	
	@After("cameraSnap2()")
	public void aboutToTakePhoto3() {
		System.out.println("take photo from Lens class after advice");
	}
}
