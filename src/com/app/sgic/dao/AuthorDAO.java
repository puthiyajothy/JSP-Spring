package com.app.sgic.dao;

import java.util.List;

import com.app.sgic.model.Author;


public interface AuthorDAO {
	
	public abstract void createAuthor(Author author);
	public abstract Author getAuthor(int authotId);
	public abstract void updateClassificationById(String authorName ,int authotId);
	public abstract List<Author>getAllAuthorList();

}
