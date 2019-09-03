package service_Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Book_Dao;
import entity.Book;
import service.Book_Service;
import utils.ReturnInfo;

@Service
public class Book_Service_Impl implements Book_Service{

	@Autowired
	Book_Dao dao;
	
	public ReturnInfo select(String txt,Integer page,Integer limit) {
		ReturnInfo info=new ReturnInfo();
		String limitstr="";
		if(page!=null) {
			limitstr=" limit "+((page-1)*limit)+","+limit;
			info.setCount(dao.selectCount(txt));
		}
		info.setList(dao.select(txt,limitstr));
		return info;
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
