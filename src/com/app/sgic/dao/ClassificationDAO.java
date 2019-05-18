package com.app.sgic.dao;

import java.util.List;

import com.app.sgic.model.Classification;

public interface ClassificationDAO {
	
	abstract void createClassification(Classification classification);
	public abstract Classification getClassificationById(int classification_id);
	public abstract void deleteClassificationById(Integer classification_id);
	public abstract void updateClassificationById(Integer classificationId2,int classification_id);
	public abstract List<Classification>getAllClassifictionList(); 
	

}
