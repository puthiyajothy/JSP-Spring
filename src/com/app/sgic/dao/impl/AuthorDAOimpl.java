package com.app.sgic.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import javax.sql.DataSource;
import com.app.sgic.dao.AuthorDAO;
import com.app.sgic.model.Author;


public class AuthorDAOimpl implements AuthorDAO {

	private  DataSource dataSource;
	
	
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void createAuthor(Author author) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection=dataSource.getConnection();
			String SQL="INSERT INTO author(author_id,author_name) VALUES(?,?)";
			ps=connection.prepareStatement(SQL);
		
			
			ps.setInt(1, author.getAuthotId());
			ps.setString(2, author.getAuthorName());
			int executeUpdate =ps.executeUpdate();
			
			if(executeUpdate>0) {
				System.out.println("Author is created");
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
	public Author getAuthor(int authotId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateClassificationById(String authorName, int authotId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Author> getAllAuthorList() {
		Connection connection=null;
		PreparedStatement ps=null;
		List<Author>authorList =new ArrayList<Author>();
		
		try
		{
		connection=dataSource.getConnection();
		String SQL ="SELECT author_id,author_name FROM author";
		ps=connection.prepareStatement(SQL);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			Author author=new Author();
			author.setAuthotId(rs.getInt("author_id"));
			author.setAuthorName(rs.getString("author_name"));
			
			
			authorList.add(author);
		}
		
		}catch(Exception e)
		{
		}
		return authorList;
	}
	
	
	}


