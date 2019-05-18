package com.app.sgic.service;

import java.util.List;

import com.app.sgic.model.Author;
import com.app.sgic.model.Classification;


public interface Authorservice {

	public abstract void addAuthor(Author author);
	public abstract Author getAuthor(int authotId);
	public abstract Author updateClassificationById(String authorName ,int authotId);
	public abstract List<Author>getAllAuthorList();

}
