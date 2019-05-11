package com.app.sgic.dao;

import java.util.List;

import com.app.sgic.model.Classification;

public interface ClassificationDAO {
	
	abstract void createClassification(Classification classification);
	public abstract Classification getClassificationById(int classifictionId);
	public abstract Integer deleteClassificationById(Integer classifictionId);
	public abstract void updateClassificationById(Integer classificationId2,int classificationId);
	public abstract List<Classification>getAllClassifictionList(); 
	

}
