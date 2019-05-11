package com.app.sgic.client;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.sgic.model.Author;
import com.app.sgic.model.Classification;
import com.app.sgic.service.Authorservice;
import com.app.sgic.service.Classifictionservice;

public class Test {
	
	public static void main(String args[]) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		Classifictionservice classifictionservice=context.getBean("classifictionService",Classifictionservice.class);
//		 Authorservice authorservice=context.getBean("authorService",Authorservice.class);
		Classification classification=new Classification();
		classification.setClassification_id(13);
		classification.setClassification_name("cfgd");
	
		classifictionservice.addClassification(classification);
//		Author author=new Author();
//		author.setAuthotId(10);
//		author.setAuthorName("saajitha");
//		
//		authorservice.addAuthor(author);
		 
//		for(Classification classification:classifictionservice.getAllClassifictionList()) {
//			System.out.println(classification.getClassification_id()+""+classification.getClassification_name());
//		}
	}

}
