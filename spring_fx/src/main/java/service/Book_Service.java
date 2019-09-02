package service;

import java.util.List;

import entity.Book;

public interface Book_Service {

	public List<Book> select(String where);
	
	public Book selectById(int id);
	
	public void delete(int id);
	
	public void insert(Book t);
	
	public void update(Book t);
}
