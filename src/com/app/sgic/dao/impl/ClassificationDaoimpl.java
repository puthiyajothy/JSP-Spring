package com.app.sgic.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.app.sgic.dao.ClassificationDAO;
import com.app.sgic.model.Classification;
import com.mysql.cj.x.protobuf.MysqlxSession.ResetOrBuilder;

public class ClassificationDaoimpl implements ClassificationDAO {

	
	//dependency
	
	private  DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public void createClassification(Classification classification) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection=dataSource.getConnection();
			String SQL="INSERT INTO classification(classification_id,classification_name) VALUES(?,?)";
			ps=connection.prepareStatement(SQL);
		
			
			ps.setInt(1, classification.getClassification_id());
			ps.setString(2, classification.getClassification_name());
			int executeUpdate =ps.executeUpdate();
			
			if(executeUpdate>0) {
				System.out.println("classification is created");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		
	}

	@Override
	public Classification getClassificationById(int classifictionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteClassificationById(Integer classifictionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateClassificationById(Integer classificationId2, int classificationId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Classification> getAllClassifictionList() {
		Connection connection=null;
		PreparedStatement ps=null;
		List<Classification>classificationList =new ArrayList<Classification>();
		
		try
		{
		connection=dataSource.getConnection();
		String SQL ="SELECT classification_id,classification_name FROM classification";
		ps=connection.prepareStatement(SQL);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			Classification classification=new Classification();
			classification.setClassification_id(rs.getInt("classification_id"));
			classification.setClassification_name(rs.getString("classification_name"));
			
			classificationList.add(classification);
		}
		
		}catch(Exception e)
		{
		}
		return classificationList;
	}
	
	
	

	
	
	
	
}
