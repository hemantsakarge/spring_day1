package com.cjc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	BeanFactory beanf=new ClassPathXmlApplicationContext("bean.xml");
	beanf.getBean("s");
}
}
