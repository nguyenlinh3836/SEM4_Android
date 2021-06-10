package com.example.ss2.controller;

import com.example.ss2.entity.ProductEntity;
import com.example.ss2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class WebController {
    @Autowired
    ProductService productService;

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }

//    @GetMapping({"/listproduct"})
//    public String listProduct(Model model) {
//        return findPaginated(1, model);
//    }
//
//    @GetMapping("/page/{pageNo}")
//    public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model) {
//        int pageSize = 4;
//        Page<ProductEntity> page = productService.findPaginated(pageNo,pageSize);
//        List< ProductEntity > listProducts = page.getContent();
//        model.addAttribute("currentPage", pageNo);
//        model.addAttribute("totalPages", page.getTotalPages());
//        model.addAttribute("totalItems", page.getTotalElements());
//        model.addAttribute("products", listProducts);
//        return "listproduct";
//    }


    @GetMapping({"/listproduct"})
    public String pageableProduct(Model model,
                                  @RequestParam(value = "page", defaultValue = "0") int page,
                                  @RequestParam(value = "size", defaultValue = "3") int size) {
        List<ProductEntity> products = productService.getAllProducts(PageRequest.of(page, size));
        int totalPage  = productService.getTotalPage(PageRequest.of(page,size));
        model.addAttribute("totalPage", totalPage);
        model.addAttribute("size", size);
        model.addAttribute("page", page);
        model.addAttribute("products", products);
        return "listproduct";
    }

    @GetMapping("/Create")
    public String Create(Model model){
        model.addAttribute("products",new ProductEntity());
        return "Create";
    }

    @PostMapping(value = "/add")
    public String createProduct(@ModelAttribute ProductEntity p, Model model){
        productService.createProduct(p);
        return "redirect:/Create";
    }

    @GetMapping("/edit/{id}")
    public String Update(Model model, @PathVariable(value = "id") int id){
       ProductEntity p = productService.getById(id);
       model.addAttribute("p", p);
       return "update";
    }

    @PostMapping(value = "/edit")
    public String UpdateProduct(@ModelAttribute ProductEntity p){
        productService.updateProduct(p);
        return "redirect:/";
    }

    @GetMapping("delete/{id}")
    public String deleteProduct(@PathVariable(value = "id") int id){
        productService.deleteProduct(id);
        return "redirect:/";
    }

}
