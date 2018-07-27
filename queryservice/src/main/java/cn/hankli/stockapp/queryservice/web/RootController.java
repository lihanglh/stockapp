package cn.hankli.stockapp.queryservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

	@GetMapping("/")
    public String greeting( Model model) {
        model.addAttribute("name", "stockapp");
        return "greeting";
    }
	
}
