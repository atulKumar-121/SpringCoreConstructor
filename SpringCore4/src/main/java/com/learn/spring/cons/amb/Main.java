package com.learn.spring.cons.amb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/learn/spring/cons/amb/config.xml");
		Addition add = (Addition) ctx.getBean("add");
		

	}

}
