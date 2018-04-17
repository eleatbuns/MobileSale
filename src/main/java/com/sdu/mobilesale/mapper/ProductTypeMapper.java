package com.sdu.mobilesale.mapper;

import com.sdu.mobilesale.model.ProductType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "ProductTypeMapper")
@Mapper
public interface ProductTypeMapper {
    int deleteByPrimaryKey(Integer productTypeId);

    int insert(ProductType record);

    int insertSelective(ProductType record);

    ProductType selectByPrimaryKey(Integer productTypeId);

    int updateByPrimaryKeySelective(ProductType record);

    int updateByPrimaryKey(ProductType record);

    List<ProductType> getProductType();
}