package controller;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service_Impl.Basic_Service_Impl;
import utils.ReturnInfo;
import utils.ReturnJson;
import utils.SearchInfo;


public class BasicController<T> {
	Basic_Service_Impl<T> basicservice;
	
	@ModelAttribute
	public void init() throws Exception{
		Field f=this.getClass().getDeclaredField("service");
		f.setAccessible(true);
		Object dao=f.get(this);
		basicservice=(Basic_Service_Impl<T>) dao;
	}
	
	private String getTname() {
		return getRealType().getSimpleName();
	}
	
	public Class getRealType(){
		// ��ȡ��ǰnew�Ķ���ķ��͵ĸ�������
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		// ��ȡ��һ�����Ͳ�������ʵ����
		return (Class<T>) pt.getActualTypeArguments()[0];
	}
	
	@GetMapping("{id}")
	public @ResponseBody T edit(@PathVariable("id") int id,ModelMap m) {
		return basicservice.getByid(id);
	}
	@GetMapping()
	public @ResponseBody ReturnInfo index(SearchInfo info,Integer page,Integer limit,ModelMap m) {
		return basicservice.getWhere(info.getWhere(),page,limit);
	}
	
	@PostMapping()
	public @ResponseBody ReturnJson insert( T t,ModelMap m) {
		basicservice.insert(t);
		return new ReturnJson();
	}
	
	@DeleteMapping("{id}")
	public @ResponseBody ReturnJson delete(@PathVariable("id") int id,ModelMap m) {
		basicservice.delete(id);
       return new ReturnJson();
	}
	
	@PutMapping("{id}")
	public @ResponseBody ReturnJson update(T t,ModelMap m) {
		basicservice.update(t);
		return new ReturnJson();
	}
}
