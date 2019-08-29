package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import dao.Type_Dao;
import entity.Type;
import service.Type_Service;

@Component
public class Type_Service_Impl implements Type_Service{

	@Autowired
	Type_Dao dao;
	public List<Type> select(String txt){
		if(txt==null||txt=="")
			return dao.select("");
		else
			return dao.select(" where name like '%"+txt+"%'");
	}
}
