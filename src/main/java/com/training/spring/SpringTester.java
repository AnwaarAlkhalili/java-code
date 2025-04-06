package com.training.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester {

	public static void main(String[] args) {
		
		final Logger logger = (Logger) LoggerFactory.getLogger(SpringTester.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		logger.info("Spring container is created");
		Employee emp = (Employee)context.getBean("employee");
		logger.debug("Employee Object Created");
		Department dept = (Department)context.getBean("dept");
		System.out.println(emp.getEmpName()+":"+emp.getEmpId());
		System.out.println(dept.getDeptName());
		System.out.println(emp.getEmpDetails());

	} 

}