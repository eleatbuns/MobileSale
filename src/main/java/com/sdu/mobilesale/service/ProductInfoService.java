package com.sdu.mobilesale.service;

import com.github.pagehelper.PageInfo;
import com.sdu.mobilesale.model.ProductInfo;

public interface ProductInfoService {
    /**
     * 添加新商品
     * @param productInfo
     * @return
     */
    int addNewProduct(ProductInfo productInfo);

    /**
     * 列出产品列表
     * @param pageNum
     * @param productType
     * @return
     */
    PageInfo<ProductInfo> getProductList(Integer pageNum, Integer productType);
    /**
     * 更新商品信息
     * @param productInfo
     * @return
     */
    int updateProduct(ProductInfo productInfo);
    /**
     * 下架商品
     * @param productId
     * @return
     */
    int saleOffProduct(int productId);
    /**
     * 上架商品
     * @param productId
     * @return
     */
    int saleOnProduct(int productId);
    /**
     * 删除商品
     * @param productId
     * @return
     */
    int deleteProduct(int productId);
}
