package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class convertController {
    @GetMapping("/converter")
    public String index() {
        return "index";
    }

    @PostMapping("/usd")
    public String calculate(@RequestParam String usd, String rate, Model model) {
        double result = Double.parseDouble(usd)*Double.parseDouble(rate);
        model.addAttribute("result1", result);
        return "calculate";
    }
}
