package com.app.sgic.dao;

import com.app.sgic.model.Author;

public interface AuthorDAO {
	
	public abstract void createAuthor(Author author);
	public abstract Author getAuthor(int authotId);

}
