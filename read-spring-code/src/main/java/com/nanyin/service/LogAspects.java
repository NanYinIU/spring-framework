package com.nanyin.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspects {

	@Pointcut(value="within(com.nanyin.service.*)")
	public void pointCut(){
	}

	@Before("pointCut()")
	public void logBefore(JoinPoint jp){
		System.out.println(jp.getSignature().getName());
		System.out.println("before...");
	}

	@After("pointCut()")
	public void logAfter(){
		System.out.println("after...");
	}

	@AfterReturning("pointCut()")
	public void logAfterReturn(){
		System.out.println("after return...");
	}

	@AfterThrowing(value = "pointCut()",throwing = "ex")
	public void logAfterThrowing(JoinPoint joinPoint,Exception ex){
		joinPoint.getSignature().getName();
		System.out.println("after throwing...");
		System.out.println(ex.getMessage());
	}
	// around在proceed 之前是在 before之前执行
	// around在proceed 之前是在 after之前执行
	// 可兼容before和after
	@Around("pointCut()")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		// 方法开始
		System.out.println("around methods begin ...");
		Object object = joinPoint.proceed();
		System.out.println("around methods end ...");
		return object;
	}
}
