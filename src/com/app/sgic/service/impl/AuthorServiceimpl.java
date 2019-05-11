package com.app.sgic.service.impl;

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
	public Author fetchAuthor(int classifictionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
