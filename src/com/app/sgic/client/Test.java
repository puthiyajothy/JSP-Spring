package com.app.sgic.client;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.sgic.model.Classification;
import com.app.sgic.service.Classifictionservice;

public class Test {
	
	public static void main(String args[]) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		Classifictionservice classifictionservice=context.getBean("classifictionservice",Classifictionservice.class);
		Classification classification=new Classification();
		classification.setClassification_id(1);
		classification.setClassification_name("maths");
		
		classifictionservice.addClassification(classification);
		
	}

}
