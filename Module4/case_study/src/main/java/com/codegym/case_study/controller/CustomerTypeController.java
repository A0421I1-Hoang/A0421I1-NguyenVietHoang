package com.codegym.case_study.controller;

import com.codegym.case_study.model.CustomerType;
import com.codegym.case_study.service.ICustomerTypeService;
import com.codegym.case_study.service.impl.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerTypeController {
    @Autowired
    private ICustomerTypeService ICustomerTypeService;

    @Autowired
    private CustomerTypeService customerTypeService;

    @GetMapping("/customerType")
    public ModelAndView listProvinces() {
        Iterable<CustomerType> customerTypes = ICustomerTypeService.findAll();
        ModelAndView modelAndView = new ModelAndView("/customerType/list");
        modelAndView.addObject("customerType", customerTypes);
        return modelAndView;
    }

    @GetMapping("/create-customerType")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/customerType/create");
        modelAndView.addObject("province", new CustomerType());
        return modelAndView;
    }

    @PostMapping("/create-customerType")
    public ModelAndView saveProvince(@ModelAttribute("customerType") CustomerType customerType) {
        ICustomerTypeService.save(customerType);

        ModelAndView modelAndView = new ModelAndView("/customerType/create");
        modelAndView.addObject("customerType", new CustomerType());
        modelAndView.addObject("message", "New customer type created successfully");
        return modelAndView;
    }

    @GetMapping("/edit-customerType/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<CustomerType> customerType = ICustomerTypeService.findOne(id);
        if (customerType.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/customerType/edit");
            modelAndView.addObject("customerType", customerType.get());
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-province")
    public ModelAndView updateCustomerType(@ModelAttribute("customerType") CustomerType customerType) {
        ICustomerTypeService.save(customerType);
        ModelAndView modelAndView = new ModelAndView("/customerType/edit");
        modelAndView.addObject("customerType", customerType);
        modelAndView.addObject("message", "Customer type updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-customerType/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Optional<CustomerType> customerType = ICustomerTypeService.findOne(id);
        if (customerType.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/customerType/delete");
            modelAndView.addObject("customerType", customerType.get());
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-customerType")
    public String deleteCustomerType(@ModelAttribute("customerType") CustomerType customerType) {
        ICustomerTypeService.delete(customerType.getId());
        return "redirect:customerType";
    }
}
