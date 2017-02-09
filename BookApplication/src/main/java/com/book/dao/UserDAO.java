package com.book.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.book.model.Book;
import com.book.model.User;
import com.book.util.ConnectionUtil;

public class UserDAO {
	JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
	public void  insert(User user) {
		String sql="insert into user (id,username,password) values (?,?,?);	";
		Object[] params={user.getId(),user.getUserName(),user.getPassword()};
		int rows=jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted"+rows);
	} 
	public void updatePassword(User user,String password) {
		String sql="update user set password=? where username=? and password=?	;";
		Object[] params={password,user.getUserName(),user.getPassword()};
		int rows=jdbcTemplate.update(sql, params);
		System.out.println("No of rows updated"+rows);
	}
	public void upadateQuantity(User user,int qty) {
		String sql="update book_sales set qty=? where userid=?;";
		Object[] params={qty,user.getId()};
		int rows=jdbcTemplate.update(sql, params);
		System.out.println("No of rows updated"+rows);
	}
	public void updateStatus(String userid) {
		String sql="update book_sales set status='cancelled' where userid=?;";
		
		int rows=jdbcTemplate.update(sql, userid);
		System.out.println("No of rows updated"+rows);
	}
	public void  updateRating(User user,Book book,int rating) {
		String sql="update book_rating set rating=? where userid=? and bookid=?;";
		Object[] params={rating,user.getId(),book.getId()};
		int rows=jdbcTemplate.update(sql, params);
		System.out.println("No of rows updated"+rows);
	}
}
