package com.cyb.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

	public LoggingAdvice() {
	
	}
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable{
		// interceptor 하는 애
		System.out.println("메서드 호출 전");
		System.out.println(invocation.getMethod()+"호출 전");
		Object o = invocation.proceed(); //Object형을 갖는 변수
		System.out.println("메서드 호출 전");
		System.out.println(invocation.getMethod()+"호출 전");
		return null;
	}
}
