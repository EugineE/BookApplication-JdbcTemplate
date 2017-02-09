package com.book.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.book.model.Book;
import com.book.util.ConnectionUtil;

public class BookDAO {
	JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
	public void insert(Book book) {
		String sql="insert into book (id,title,author,price,status) values (?,?,?,?,?);";
		Object[] parms={book.getId(),book.getTitle(),book.getAuthor(),book.getPrice(),book.getStatus()};
		int rows=jdbcTemplate.update(sql,parms);
		System.out.println("number of rows inserted"+rows);
	}
	
	public void updateContent(Book book) {
		String sql="update book set content=? where id=?;";
		Object[] params={book.getContent(),book.getId()};
		int rows=jdbcTemplate.update(sql, params);
		System.out.println("No of rows updated"+rows);
	}
	public void  delete(String id) {
		String sql="delete from book where id=?";
		Object[] params={id};
		int rows=jdbcTemplate.update(sql, params);
		System.out.println("No of rows deleted"+rows);
	}
	
	public List<Book> list()	{
		String sql="select id,title from book ";
		List<Book> list=jdbcTemplate.query(sql,(rs,rows)->
		{
			return convert(rs);
			
		});
		return list;
	}
	
	private Book convert(ResultSet rs) throws SQLException{
		Book book=new Book();
		book.setId(rs.getString("id"));
		book.setTitle(rs.getString("title"));
		return book;
	}
	public Book findBook(String id) {
		String sql="select title from book where id=?;";
		Object[] params={id};
		Book book=jdbcTemplate.queryForObject(sql,params,(rse,rowNo)->
		{
		Book b=new Book();
		b.setTitle(rse.getString(1));
		return b;
		});
		return book;
		}
	public List<String> findTitle(){
		String sql="select title from book;";
		List<String> list=jdbcTemplate.queryForList(sql,String.class);
		return list;
		
	}
}

