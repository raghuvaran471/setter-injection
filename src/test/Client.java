package test;

import org.springframework.context.ApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String files[] = new String[]{"resources/car.xml","resources/engine.xml"};
		//ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/car_engine.xml");
		Car c =(Car)ap.getBean("c");
		c.printcardata();
		
		

	}

}
