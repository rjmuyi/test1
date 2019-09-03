package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Book;
import service.Book_Service;
import service.Type_Service;
import utils.ReturnInfo;

@Controller
@RequestMapping("Book")
public class BookController {

	@Autowired
	Book_Service bservice;
	
	@Autowired
	Type_Service tservice;
	
	@RequestMapping("index")
	public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit,ModelMap m) {
		if(txt!=null&&txt.length()>0)
			txt=" where book.name like '%"+txt+"%'";
		return bservice.select(txt,page,limit);
	}
	
	@RequestMapping("delete")
	public @ResponseBody String delete(int id,ModelMap m) {
		bservice.delete(id);
		return "{\"status\":1}";
	}
	
	@RequestMapping("insert")
	public @ResponseBody String insert(Book b,ModelMap m){
		bservice.insert(b);
		return "{\"status\":1}";
	}
	
	@RequestMapping("getSexs")
	public @ResponseBody String[] getSexs() {
		return Book.sexs;
	}
	
	@RequestMapping("getTypes")
	public @ResponseBody List getTypes() {
		return tservice.select(null);
	}
	
	@RequestMapping("update")
	public @ResponseBody String update(Book b,ModelMap m){
		bservice.update(b);
		return "{\"status\":1}";
	}
	
	@RequestMapping("edit")
	public @ResponseBody Book edit(int id,ModelMap m){
		return bservice.selectById(id);
	}
	
}
