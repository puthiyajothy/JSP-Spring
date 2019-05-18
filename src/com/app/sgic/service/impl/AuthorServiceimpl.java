package com.app.sgic.service.impl;

import java.util.List;

import com.app.sgic.dao.AuthorDAO;
import com.app.sgic.model.Author;
import com.app.sgic.service.Authorservice;

public class AuthorServiceimpl implements Authorservice{

	
	private AuthorDAO authorDAO;


	public void setAuthorDAO(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}

	@Override
	public void addAuthor(Author author) {
		authorDAO.createAuthor(author);
		
	}


	@Override
	public Author getAuthor(int authotId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author updateClassificationById(String authorName, int authotId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Author> getAllAuthorList() {
		// TODO Auto-generated method stub
		return authorDAO.getAllAuthorList();
	}

}
