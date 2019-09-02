package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Book;
import entity.Type;
import service.Book_Service;
import service.Type_Service;

@Controller
@RequestMapping("Type")
public class TypeController {
	
	@Autowired
	Type_Service tservice;
	
	@RequestMapping("index")
	public String index(String name,ModelMap m) {
		String where="";
		if(name!=null&&name.length()>0)
			where=" where book.name like '%"+name+"%'";
		m.put("typelist", tservice.select(where));
		return "Type/index";
	}
	
	@RequestMapping("delete")
	public String delete(int id,ModelMap m) {
		tservice.delete(id);
		return index(null,m);
	}
	
	@RequestMapping("insert")
	public String insert(Type b,ModelMap m){
		tservice.insert(b);
		return index(null,m);
	}
	
	@RequestMapping("add")
	public String add(ModelMap m){
		m.put("sexs", Book.sexs);
		m.put("typelist", tservice.select(where));
		return "Type/edit";
	}
	
	@RequestMapping("update")
	public String update(Book b,ModelMap m){
		tservice.update(b);
		return index(null,m);
	}
	
	@RequestMapping("edit")
	public String edit(int id,ModelMap m){
		m.put("info", tservice.selectById(id));
		return add(m);
	}
	
}
