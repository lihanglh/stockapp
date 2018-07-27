package cn.hankli.stockapp.tradeservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

	@GetMapping("/")
    public String greeting( Model model) {
        model.addAttribute("name", "world");
        return "greeting";
    }
	
}
