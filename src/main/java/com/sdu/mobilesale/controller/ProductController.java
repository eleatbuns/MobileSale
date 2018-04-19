package com.sdu.mobilesale.controller;

import com.github.pagehelper.PageInfo;
import com.sdu.mobilesale.model.ProductInfo;
import com.sdu.mobilesale.model.ProductType;
import com.sdu.mobilesale.service.ProductInfoService;
import com.sdu.mobilesale.service.ProductTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    private Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductTypeService productTypeService;
    @Autowired
    private ProductInfoService productInfoService;

    @GetMapping(value = "/type")
    public List<ProductType> getProductType(){
        return productTypeService.getProductTypeList();
    }

    /**
     * 添加新商品
     * @param productInfo
     * @return
     */
    @PostMapping(value = "/new")
    @ResponseBody
    public int addNewProduct(ProductInfo productInfo){
        return productInfoService.addNewProduct(productInfo);
    }

    /**
     * 分页查询商品列表
     * @param pageNum
     * @param type
     * @return
     */
    @GetMapping(value = "/list")
    public PageInfo<ProductInfo> getProductList(@RequestParam(value = "pageNum",required = false) Integer pageNum,
                                       @RequestParam(value = "type",required = false) Integer type){
        if (pageNum == null){
            pageNum = 1;
        }
        return productInfoService.getProductList(pageNum,type);
    }

    /**
     * 更新商品
     * @param productInfo
     * @return
     */
    @PostMapping(value = "/update")
    @ResponseBody
    public int updateProduct(ProductInfo productInfo){
        return productInfoService.updateProduct(productInfo);
    }

    /**
     * 下架商品
     * @param productId
     * @return
     */
    @PutMapping(value = "/saleoff/{productId}")
    public int saleOffProduct(@PathVariable Integer productId){
        return productInfoService.saleOffProduct(productId);
    }

    /**
     * 上架商品
     * @param productId
     * @return
     */
    @PutMapping(value = "/saleon/{productId}")
    public int saleOnProduct(@PathVariable Integer productId){
        return productInfoService.saleOnProduct(productId);
    }

    /**
     * 删除商品
     * @param productId
     * @return
     */
    @DeleteMapping(value = "/delProduct/{productId}")
    public int deleteProduct(@PathVariable Integer productId){
        return productInfoService.deleteProduct(productId);
    }
}
