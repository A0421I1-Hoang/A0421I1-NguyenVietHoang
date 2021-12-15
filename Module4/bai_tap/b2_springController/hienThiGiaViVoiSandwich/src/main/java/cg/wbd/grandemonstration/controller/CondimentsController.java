package cg.wbd.grandemonstration.controller;

import cg.wbd.grandemonstration.model.Condiments;
import cg.wbd.grandemonstration.service.CondimentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CondimentsController {
    @Autowired
    private CondimentsService customerService;

    @GetMapping("/condiments")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("condiments/list.jsp");
        List<Condiments> condiments = customerService.findAll();
        modelAndView.addObject("condiments", condiments);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView showInformation(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("customers/info");
        Condiments customer = customerService.findOne(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping
    public String updateCustomer(
            @RequestParam String lettuce,
            @RequestParam String tomato,
            @RequestParam String mustand,
            @RequestParam String addsproutress
    ) {
        return "redirect:/condiments";
    }

}


