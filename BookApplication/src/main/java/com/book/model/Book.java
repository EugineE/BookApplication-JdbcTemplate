package com.book.model;



public class Book {
	private String id;
	private String title;
	private String author;
	private String date;
	private int price;
	private String status;
	private String content;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getDate() {
		return date;
	}
	public int getPrice() {
		return price;
	}
	public String getStatus() {
		return status;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", date=" + date + ", price=" + price
				+ ", status=" + status + ", content=" + content + "]";
	}
	

}
