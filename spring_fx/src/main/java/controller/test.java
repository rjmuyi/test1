package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class test {

	@RequestMapping("index")
	public void index(@RequestParam String name ,ModelMap m) {
		m.put("name", name);
		
	}
}
