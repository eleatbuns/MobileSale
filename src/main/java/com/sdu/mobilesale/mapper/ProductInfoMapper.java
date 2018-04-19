package com.sdu.mobilesale.mapper;

import com.sdu.mobilesale.model.ProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "ProductInfoMapper")
@Mapper
public interface ProductInfoMapper {
    int addNewProduct(ProductInfo productInfo);
    List<ProductInfo> productList(Integer productId);
    int updateProduct(ProductInfo productInfo);
}