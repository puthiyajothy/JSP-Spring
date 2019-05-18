package com.app.sgic.service.impl;

import java.util.List;

import com.app.sgic.dao.ClassificationDAO;
import com.app.sgic.model.Classification;
import com.app.sgic.service.Classifictionservice;

public class Classifictionserviceimpl implements Classifictionservice {
	
	private ClassificationDAO classificationDAO;
	
	public void setClassificationDAO(ClassificationDAO classificationDAO) {
		this.classificationDAO= classificationDAO;
	}

	@Override
	public void addClassification(Classification classification) {
		classificationDAO.createClassification(classification);
	
	}
	
	
	@Override
	public Classification fetchClassification(int classifictionId) {
		return classificationDAO.getClassificationById(classifictionId);
		
	}



	@Override
	public List<Classification> getAllClassifictionList() {
		return classificationDAO.getAllClassifictionList();
	}

	@Override
	public Classification updateClassificationById(int classificationId, Classification classification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClassification(int classification_id) {
		// TODO Auto-generated method stub
		classificationDAO.deleteClassificationById(classification_id);
	}

	


	

	
	
}
