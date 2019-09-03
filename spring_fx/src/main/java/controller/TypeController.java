package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Type;
import service.Type_Service;

@Controller
@RequestMapping("Type")
public class TypeController {
	
	@Autowired
	Type_Service tservice;
	
	@RequestMapping("index")
	public @ResponseBody List<Type> index(String txt,ModelMap m) {
		if(txt!=null&&txt.length()>0)
			txt=" where book.name like '%"+txt+"%'";
		return tservice.select(txt);
	}
	
	@RequestMapping("delete")
	public @ResponseBody String delete(int id,ModelMap m) {
		tservice.delete(id);
		return "{\"status\":1}";
	}
	
	@RequestMapping("insert")
	public @ResponseBody String insert(Type b,ModelMap m){
		tservice.insert(b);
		return "{\"status\":1}";
	}
	
	
	@RequestMapping("update")
	public @ResponseBody String update(Type b,ModelMap m){
		tservice.update(b);
		return "{\"status\":1}";
	}
	
	@RequestMapping("edit")
	public @ResponseBody Type edit(int id,ModelMap m){
		return tservice.selectById(id);
	}
	
}
