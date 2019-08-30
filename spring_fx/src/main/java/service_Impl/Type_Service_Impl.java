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
}
