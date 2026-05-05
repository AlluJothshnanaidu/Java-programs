package com.javaprograms;

public class Book {
	String bookname;
	String bookauthor;
	double price;
	String releaseddate;

	Book() {
		System.out.println("no arg constructor called");
	}

	Book(String bookname) {
		this("beloved","toni morrision");
		System.out.println("one arg constructor called");
	}

	Book(String bookname, String bookauthor) {	
		this("beloved","toni morrision",1000);
		System.out.println("two arg constructor called");
	}

	Book(String bookname, String bookauthor, double price) {
		this("beloved","toni morrision",1000,"feb/8/2005");
		System.out.println("three arg constructor called");
	}

	Book(String bookname, String bookauthor, double price, String releasedate) {
		System.out.println("four arg constructor called");
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.price = price;
		this.releaseddate = releasedate;
		
	}

	public static void main(String[] args) {
		System.out.println("BOOK DETAILS");
      Book b1 = new Book("beloved","toni morrision",1000,"feb/8/2005");
      b1.Show();
	}

	void Show() {
		System.out.println("book name : " + bookname);
		System.out.println("book author : " + bookauthor);
		System.out.println("price : " + price);
		System.out.println("released date : " + bookname);
	}
}