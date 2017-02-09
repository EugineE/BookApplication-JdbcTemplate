package com.book.util;

import org.springframework.jdbc.core.JdbcTemplate;

public class TestConnectionUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
		System.out.println(jdbcTemplate);
		
	}

}
