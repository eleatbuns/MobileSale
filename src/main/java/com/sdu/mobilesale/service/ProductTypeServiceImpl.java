package com.sdu.mobilesale.service;

import com.sdu.mobilesale.mapper.ProductTypeMapper;
import com.sdu.mobilesale.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "ProductTypeService")
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Override
    public List<ProductType> getProductTypeList() {
        return productTypeMapper.getProductType();
    }
}
