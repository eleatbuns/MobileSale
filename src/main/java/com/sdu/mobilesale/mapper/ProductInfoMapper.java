package com.sdu.mobilesale.mapper;

import com.sdu.mobilesale.model.ProductInfo;

public interface ProductInfoMapper {
    int deleteByPrimaryKey(Integer productId);

    int updateByPrimaryKey(ProductInfo record);
}