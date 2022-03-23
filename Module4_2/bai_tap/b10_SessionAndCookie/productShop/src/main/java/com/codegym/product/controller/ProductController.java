package com.codegym.product.controller;

import com.codegym.product.model.Cart;
import com.codegym.product.model.Product;
import com.codegym.product.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @ModelAttribute("cart")
    public Cart setUpCart(){
        return new Cart();
    }

    @GetMapping("")
    public String home(){
        return "home";
    }

    @GetMapping("/index")
    public ModelAndView showList(@PageableDefault(size = 5) Pageable pageable, @RequestParam("search") Optional<String> search, Model model){
        Page<Product> products;
        if (search.isPresent()){
            products = productService.findAllByNameContaining(search.get(), pageable);
            model.addAttribute("search", search.get());
        } else {
            products = productService.findAll(pageable);
        }
        return new ModelAndView("index", "product", products);
    }

    @GetMapping("create")
    public String showCreateBlog(Model model){
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("save")
    public String save(@Valid @ModelAttribute Product product,BindingResult bindingResult, RedirectAttributes redirectAttributes,  Model model){
        if (bindingResult.hasErrors()){
//            List<TypeBlog> typeBlogs = typeBlogService.findAll();
//            model.addAttribute("typeBlog", typeBlogs);
            return "create";
        } else {
            productService.save(product);
            redirectAttributes.addFlashAttribute("success", "Create new blog success");
            return "redirect:/index";
        }
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable Long id, Model model){
        model.addAttribute("product", productService.findById(id));
        return "view";
    }

    @GetMapping("/{id}/delete")
    public String showDeleteForm(@PathVariable Long id, Model model){
        model.addAttribute("product", productService.findById(id));
        return "delete";
    }

    @PostMapping("delete")
    public String delete(Long id, RedirectAttributes redirectAttributes){
        productService.delete(id);
        redirectAttributes.addAttribute("success", "Delete blog success");
        return "redirect:/index";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model){
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }

    @PostMapping("update")
    public String update(Product product, RedirectAttributes redirectAttributes){
        productService.save(product);
        redirectAttributes.addAttribute("success", "Edit blog success");
        return "redirect:/index";
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Optional<Product> productOptional = Optional.ofNullable(productService.findById(id));
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("add")) {
            cart.addProduct(productOptional.get());
            return "redirect:/cart";
        }
        if (action.equals("minus")) {
            cart.minusProduct(productOptional.get());
            return "redirect:/cart";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/index";
    }

    @GetMapping("/cart")
    public ModelAndView showCart (@SessionAttribute("cart") Cart cart){
        ModelAndView modelAndView = new ModelAndView("/cart");
        modelAndView.addObject("cart",cart);
        return modelAndView;
    }
}
