package com.app.sgic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.sgic.model.Author;

import com.app.sgic.service.Authorservice;

import com.app.sgic.service.impl.AuthorServiceimpl;




@WebServlet("/AuthorController")
public class AuthorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AuthorController() {
        super();
    }
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			
			throws ServletException, IOException {
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
			
			Authorservice authorservice = context.getBean("authorService",AuthorServiceimpl.class);
			response.setContentType("application/json");
			PrintWriter writer = response.getWriter();
			
			JsonObjectBuilder rootBuilder = Json.createObjectBuilder();
			JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();

			JsonObjectBuilder planBuilder = Json.createObjectBuilder();
			
			
			
			for (Author author:authorservice.getAllAuthorList()){
				JsonObject planJson = planBuilder.add("author_id",author.getAuthotId())
						.add("author_name", author.getAuthorName()).build();
				arrayBuilder.add(planJson);
			}
				
			JsonObject root = rootBuilder.add("author", arrayBuilder).build();
			writer.print(root);
			writer.flush();
//			writer.close();
			
		}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		
		String author_id =request.getParameter("author_id");
		int a = Integer.parseInt(author_id);
		String author_name =request.getParameter("author_name");
		
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Authorservice authorservice = context.getBean("authorService", AuthorServiceimpl.class );
		
		
		Author author =new Author();
		author.setAuthotId(a);
		author.setAuthorName(author_name);
		authorservice.addAuthor(author);
	
		doGet(request, response);
		
		//response.getWriter().println("response");
	}

}
