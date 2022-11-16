package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController{

	@GetMapping("/HelloWorld")
	public String saluda(@RequestParam(name="name", defaultValue="UKNOWN") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

}
