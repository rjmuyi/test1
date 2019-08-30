package service;

import java.util.List;

import entity.Type;

public interface Type_Service {

	public List<Type> select(String where);
	
	public Type selectById(int id);
	
	public void delete(int id);
	
	public void insert(Type t);
	
	public void update(Type t);
}
