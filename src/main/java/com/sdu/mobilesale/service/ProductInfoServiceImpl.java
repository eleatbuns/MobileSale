package com.sdu.mobilesale.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sdu.mobilesale.mapper.ProductInfoMapper;
import com.sdu.mobilesale.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public int addNewProduct(ProductInfo productInfo) {
        return productInfoMapper.addNewProduct(productInfo);
    }

    @Override
    @CachePut(value = "ProductCache", key = "#pageNum")
    public PageInfo<ProductInfo> getProductList(Integer pageNum, Integer productType) {
        //当前显示的页数，每页显示的数目
        PageHelper.startPage(pageNum, 10);
        List<ProductInfo> productInfoList = productInfoMapper.productList(productType);
        PageInfo<ProductInfo> pageInfo = new PageInfo<>(productInfoList);
        return pageInfo;
    }

    @Override
    @Transactional
    public int updateProduct(ProductInfo productInfo) {
        return productInfoMapper.updateProduct(productInfo);
    }

    @Override
    @Transactional
    public int saleOffProduct(int productId) {
        return productInfoMapper.saleOffProduct(productId);
    }
    @Override
    @Transactional
    public int saleOnProduct(int productId) {
        return productInfoMapper.saleOnProduct(productId);
    }

    @Override
    @Transactional
    public int deleteProduct(int productId) {
        return productInfoMapper.deleteProduct(productId);
    }


}
