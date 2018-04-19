package com.sdu.mobilesale.service;

import com.github.pagehelper.PageInfo;
import com.sdu.mobilesale.model.ProductInfo;

public interface ProductInfoService {
    int addNewProduct(ProductInfo productInfo);
    PageInfo<ProductInfo> getProductList(Integer pageNum, Integer ProductType);
    int updateProduct(ProductInfo productInfo);
}
