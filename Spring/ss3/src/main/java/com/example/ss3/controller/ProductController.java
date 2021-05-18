package com.example.ss3.controller;

import com.example.ss3.entity.ProductEntity;
import com.example.ss3.model.BaseResponse;
import com.example.ss3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public BaseResponse getProduct(@RequestParam Map<String, String> params){
        BaseResponse res = new BaseResponse();
        String name = params.get("name");
        String id = params.get("id");
        if(name != null){
            res.data = productService.getProductByNameCustom(name);
        } else if(id != null) {
            res.data = productService.getProductById(Integer.parseInt(id));
        } else  {
            res.data = productService.getAllProduct();
        }
        return res;
    }

    @PostMapping
    public BaseResponse createProduct(@RequestBody ProductEntity p){
        BaseResponse res = new BaseResponse();
        res.data = productService.createProduct(p);
        return res;
    }

    @PutMapping
    public BaseResponse updateProduct(@RequestBody ProductEntity p){
        BaseResponse res = new BaseResponse();
        res.data = productService.updateProduct(p);
        return res;
    }



}
