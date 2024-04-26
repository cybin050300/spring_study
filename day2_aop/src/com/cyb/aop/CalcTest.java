package com.cyb.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcTest {

	public CalcTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 1. xml loading
		ApplicationContext context = new ClassPathXmlApplicationContext("aoptext.xml");
		
		// 2. beam 요청
		Calculator calc = (Calculator)context.getBean("proxy");
		
		calc.add(10, 20);
				

	}

}
