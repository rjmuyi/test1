package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Book;
import service.Book_Service;
import service.Type_Service;

@Controller
public class BookController {

	@Autowired
	Book_Service bservice;
	
	@Autowired
	Type_Service tservice;
	
	@RequestMapping("index")
	public String index(String name,ModelMap m) {
		String where="";
		if(name!=null&&name.length()>0)
			where=" where book.name like '%"+name+"%'";
		m.put("booklist", bservice.select(where));
		return "index";
	}
	
	@RequestMapping("delete")
	public String delete(int id,ModelMap m) {
		bservice.delete(id);
		return index(null,m);
	}
	
	@RequestMapping("insert")
	public String insert(Book b,ModelMap m){
		bservice.insert(b);
		return index(null,m);
	}
	
	@RequestMapping("add")
	public String add(ModelMap m){
		m.put("sexs", Book.sexs);
		m.put("typelist", tservice.select());
		return "edit";
	}
	
	@RequestMapping("update")
	public String update(Book b,ModelMap m){
		bservice.update(b);
		return index(null,m);
	}
	
	@RequestMapping("edit")
	public String edit(int id,ModelMap m){
		m.put("info", bservice.selectById(id));
		return add(m);
	}
	
}
