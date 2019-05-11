package com.app.sgic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.sgic.model.Classification;
import com.app.sgic.service.Classifictionservice;
import com.app.sgic.service.impl.Classifictionserviceimpl;

@WebServlet("/ClassificationController")
public class ClassificationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ClassificationController() {
        //super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String classification_id = request.getParameter("classification_id");
		 int a = Integer.parseInt(classification_id);
		String classification_name = request.getParameter("classification_name");

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Classifictionservice classifictionservice= context.getBean("classifictionService",Classifictionserviceimpl.class);

		Classification classification = new Classification();
		classification.setClassification_id(a);
		classification.setClassification_name(classification_name);
		
		classifictionservice.addClassification(classification);
		
		
		doGet(request,response);
//		response.getWriter().println("responce");
	}

}