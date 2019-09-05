package service_Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Type_Dao;
import entity.Type;
import service.Type_Service;

@Service
public class Type_Service_Impl extends Basic_Service_Impl<Type> implements Type_Service{

	@Autowired
	Type_Dao dao;
	
}
