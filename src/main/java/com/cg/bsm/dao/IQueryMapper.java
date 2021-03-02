package com.cg.bsm.dao;

public interface IQueryMapper {

	public static final String ADD_BOOK_QRY = 
			"INSERT INTO book(bcode,  title, price, publishdate) VALUES(?,?,?,?)";
	public static final String MODIFY_BOOK_QRY = 
			"UPDATE book SET title=?,price=?,publishdate=? WHERE bcode=?";
	public static final String DEL_BOOK_QRY = 
			"DELETE FROM book WHERE bcode=?";
	public static final String GET_ALL_BOOKS_QRY = 
			"SELECT * FROM book";
	public static final String GET_BOOK_QRY = 
			"SELECT * FROM book WHERE bcode=?";
}
