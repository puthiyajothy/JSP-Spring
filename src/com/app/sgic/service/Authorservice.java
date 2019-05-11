package com.app.sgic.service;

import com.app.sgic.model.Author;


public interface Authorservice {

	public abstract void addAuthor(Author author);
	public abstract Author fetchAuthor(int classifictionId);
}
