package com.book.dao;

import java.util.Scanner;

import com.book.dao.UserDAO;
import com.book.model.Book;
import com.book.model.User;

public class TestUserdAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		UserDAO userDAO=new UserDAO();
		Book book=new Book();
//		user.setId("e101");
//		user.setPassword("3108");
//		user.setUserName("Eugine");
//		userDAO.insert(user);
		
		
//		System.out.println("Enter new password");
//		Scanner scanner=new Scanner(System.in);
//		String password=scanner.next();
//		userDAO.updatePassword(user, password);
		
		
//		userDAO.upadateQuantity(user, 5);
//		userDAO.updateStatus("e101");
		user.setId("e101");
		book.setId("a102");
		userDAO.updateRating(user, book, 4);
	}

}
