package com.learn.spring.cons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/learn/spring/cons/config.xml");
		Address add = (Address) ctx.getBean("add");
		System.out.println(add);
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println(emp);

	}

}
