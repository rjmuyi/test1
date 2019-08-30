package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import service.Type_Service;

@Controller
public class testController {

	@Autowired
	Type_Service tservice;
	
	@RequestMapping("index")
	public String select(String name,ModelMap m) {
		String where="";
		if(name!=null&&name.length()>0)
			where=" where name like '%"+name+"%'";
		m.put("typelist", tservice.select(name));
		return "index";
	}
}
