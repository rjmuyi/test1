package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Book_Dao;
import entity.Book;
import service.Book_Service;

@Service
public class Book_Service_Impl implements Book_Service{

	@Autowired
	Book_Dao dao;
	
	public List<Book> select(String where){
		return dao.select(where);
	}
	public Book selectById(int id) {
		return dao.selectById(id);
	}
	public void delete(int id) {
		dao.delete(id);
	}
	public void insert(Book t) {
		dao.insert(t);
	}
	public void update(Book t) {
		dao.update(t);
	}
}
