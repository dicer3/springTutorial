package sringmvc.controller;

@Controller
public class HomeController {
    
	@RequestMapping("/home")
	public String home() {
		System.out.println("gk");
		return "index";
	}
}
