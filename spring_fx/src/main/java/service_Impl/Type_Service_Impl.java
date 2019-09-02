package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Type_Dao;
import entity.Type;
import service.Type_Service;

@Service
public class Type_Service_Impl implements Type_Service{

	@Autowired
	Type_Dao dao;
	
	public List<Type> select(String where){
		return dao.select(where);
	}
	public Type selectById(int id) {
		return dao.selectById(id);
	}
	public void delete(int id) {
		dao.delete(id);
	}
	public void insert(Type t) {
		dao.insert(t);
	}
	public void update(Type t) {
		dao.update(t);
	}
}
