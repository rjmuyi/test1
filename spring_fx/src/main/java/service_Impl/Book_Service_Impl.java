package service_Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Book_Dao;
import entity.Book;
import service.Book_Service;

@Service
public class Book_Service_Impl extends Basic_Service_Impl<Book> implements Book_Service{

	@Autowired
	Book_Dao dao;
	
}
