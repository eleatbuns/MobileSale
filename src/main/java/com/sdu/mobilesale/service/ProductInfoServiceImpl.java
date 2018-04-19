package com.sdu.mobilesale.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sdu.mobilesale.mapper.ProductInfoMapper;
import com.sdu.mobilesale.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "ProductInfoService")
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    /**
     * 添加新商品
     * @param productInfo
     * @return
     */
    @Override
    public int addNewProduct(ProductInfo productInfo) {
        return productInfoMapper.addNewProduct(productInfo);
    }

    @Override
    @Cacheable(value = "ProductCache", key = "#pageNum")
    public PageInfo<ProductInfo> getProductList(Integer pageNum, Integer productType) {
        //当前显示的页数，每页显示的数目
        PageHelper.startPage(pageNum, 10);
        List<ProductInfo> productInfoList = productInfoMapper.productList(productType);
        PageInfo<ProductInfo> pageInfo = new PageInfo<>(productInfoList);
        return pageInfo;
    }

    @Override
    public int updateProduct(ProductInfo productInfo) {
        return productInfoMapper.updateProduct(productInfo);
    }


}
