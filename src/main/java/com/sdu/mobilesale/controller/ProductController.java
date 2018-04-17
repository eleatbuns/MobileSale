package com.sdu.mobilesale.controller;

import com.sdu.mobilesale.model.ProductInfo;
import com.sdu.mobilesale.model.ProductType;
import com.sdu.mobilesale.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    private ProductTypeService productTypeService;

    @GetMapping(value = "/type")
    public List<ProductType> getProductType(){
        return productTypeService.getProductTypeList();
    }

    @PostMapping(value = "/new")
    @ResponseBody
    public ProductInfo addNewProduct(ProductInfo productInfo){
        System.out.println(productInfo.getProductDescription());
        return productInfo;
    }

}
