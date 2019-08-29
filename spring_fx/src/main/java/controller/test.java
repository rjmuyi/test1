package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {

	@RequestMapping("index")
	public void index(String name ,ModelMap m) {
		m.put("name", name);
		
	}
}
