package com.app.sgic.service;

import java.util.List;

import com.app.sgic.model.Classification;

public interface Classifictionservice {
	

	public abstract void addClassification(Classification classification);
	public abstract Classification fetchClassification(int classification_id);
	public abstract void deleteClassification(int classification_id );
	public abstract Classification updateClassificationById(int classification_id, Classification classification);
	public abstract List<Classification>getAllClassifictionList();
	
}
