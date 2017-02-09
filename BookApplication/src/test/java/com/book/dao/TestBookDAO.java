package com.book.dao;

import java.util.Iterator;
import java.util.List;

import com.book.dao.BookDAO;
import com.book.model.Book;;
public class TestBookDAO {

	public static void main(String[] args) {
		BookDAO bookDAO=new BookDAO();
		Book book=new Book();
		
		book.setId("A10");
		book.setAuthor("Kalam");
		book.setPrice(100);
		book.setStatus("YES");
		book.setTitle("novel");
		
		//bookDAO.insert(book);
		
//		book.setContent("wings of fire");
//		bookDAO.updateContent(book);
		
	//	bookDAO.delete("A10");
		List<Book> list=bookDAO.list();
		Iterator<Book> iterator=list.iterator();
		while(iterator.hasNext())
		{
			Book b=iterator.next();
			System.out.println(b.getId());
			System.out.println(b.getTitle());
		}
		System.out.println(bookDAO.list());
		System.out.println(bookDAO.findBook("1"));
		System.out.println(bookDAO.findTitle());
	}

}
