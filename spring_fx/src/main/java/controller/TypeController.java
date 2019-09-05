package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Type;
import service.Type_Service;
import utils.ReturnInfo;
import utils.SearchInfo;

@RestController
@RequestMapping("Type")
public class TypeController extends BasicController<Type>{
	
	@Autowired
	Type_Service service;
	
	@Override
	public ReturnInfo index(SearchInfo info, Integer page, Integer limit, ModelMap m) {
			info.addLike("name");
		return super.index(info, page, limit, m);
	}
	
	@GetMapping("list")
	public List getlist() {
		return service.getAll();
	}
}
