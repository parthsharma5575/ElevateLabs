package com.learning.unit1;

import java.util.HashMap;

class User{
	int userId;
	int issuedBook;
	public User(int id){//new user registration 
		this.userId=id;
		this.issuedBook=-1;
	}
}
class Book {
	int bookId;
	String name;
	boolean issued;
	public Book(int bookId, String name) {
		this.bookId = bookId;
		this.name = name;
		this.issued = false;
	}
	
	
	
}
class Library {
	

	HashMap<Integer,Book>Books=new HashMap<>();
	HashMap<Integer,User>Users=new HashMap<>();
	void addBook(Book b) {
		Books.put(b.bookId, b);
	}
	void addUser(User u) {
		Users.put(u.userId, u);
	}
	void issueBook(int uId,int bId) {
		User u=Users.get(uId);
		Book b=Books.get(bId);
		if(u==null || b==null) {
			System.out.println("User or Book not found!");
			return;
		}
		if(u.issuedBook==-1 && b.issued==false) {
			u.issuedBook=b.bookId;
			b.issued=true;
			System.out.println("Book id "+ b.bookId +" has been issued to User id "+u.userId);
		}else {
			System.out.println("Cannot issue book !");
		}
	}
	void returnBook(int uId) {
		User u=Users.get(uId);
		if(u.issuedBook==-1) {
			System.out.println("No Book to return!");
		}else {
			int bookID=u.issuedBook;
			u.issuedBook=-1;
			Book b=Books.get(bookID);
			b.issued=false;
			System.out.println("User id "+ uId +" has successfully return book id "+bookID);
			
			
		}
	}
}

public class Lib {

	public static void main(String[] args) {
		Library lb=new Library();
		Book b1=new Book(1, "Harry Potter");
		Book b2=new Book(2,"Prem chand");
		User u1=new User(22);
		User u2=new User(25);
		lb.addBook(b1);
		lb.addBook(b2);
		lb.addUser(u2);
		lb.addUser(u1);
		
		lb.issueBook(22, 2);//issue book to user 22
		lb.issueBook(25, 2);//already issued book 
		lb.returnBook(22);//user 22 return the book
		lb.issueBook(25, 2);//user 25 issues the bo0k 2
		lb.issueBook(22, 1);//issue book 1 to user 22

	}

}
