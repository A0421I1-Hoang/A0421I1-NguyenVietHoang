package com.codegym.baiThi.controller;

import com.codegym.baiThi.model.ProductType;
import com.codegym.baiThi.service.IProductTypeService;
import com.codegym.baiThi.service.impl.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class ProductTypeController {

    private IProductTypeService iProductTypeService;

    @Autowired
    private ProductTypeService productTypeService;

    @GetMapping("/productTypes")
    public ModelAndView listProvinces() {
        Iterable<ProductType> productTypes = iProductTypeService.findAll();
        ModelAndView modelAndView = new ModelAndView("/productTypes/list");
        modelAndView.addObject("productTypes", productTypes);
        return modelAndView;
    }

    @GetMapping("/create-productTypes")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/productTypes/create");
        modelAndView.addObject("productTypes", new ProductType());
        return modelAndView;
    }

    @PostMapping("/create-productTypes")
    public ModelAndView saveProvince(@ModelAttribute("productTypes") ProductType productType) {
        iProductTypeService.save(productType);

        ModelAndView modelAndView = new ModelAndView("/productTypes/create");
        modelAndView.addObject("productTypes", new ProductType());
        modelAndView.addObject("message", "New product type created successfully");
        return modelAndView;
    }

    @GetMapping("/edit-productTypes/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<ProductType> productType = iProductTypeService.findOne(id);
        if (productType.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/productTypes/edit");
            modelAndView.addObject("productTypes", productType.get());
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-productTypes")
    public ModelAndView updateCustomerType(@ModelAttribute("productTypes") ProductType productType) {
        iProductTypeService.save(productType);
        ModelAndView modelAndView = new ModelAndView("/productTypes/edit");
        modelAndView.addObject("productTypes", productType);
        modelAndView.addObject("message", "Product type updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-productTypes/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Optional<ProductType> productType = iProductTypeService.findOne(id);
        if (productType.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/productTypes/delete");
            modelAndView.addObject("productTypes", productType.get());
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-productTypes")
    public String deleteCustomerType(@ModelAttribute("customerType") ProductType productType) {
        iProductTypeService.delete(productType.getId());
        return "redirect:productTypes";
    }
}
