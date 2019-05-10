package com.app.sgic.service;

import java.util.List;

import com.app.sgic.model.Classification;

public interface Classifictionservice {
	

	public abstract void addClassification(Classification classification);
	public abstract Classification fetchClassification(int classifictionId);
	public abstract Integer deleteClassification(int classifictionId);
	public abstract Classification updateClassificationById(int classificationId, Classification classification);
	public abstract List<Classification>getAllClassifictionList();
}
