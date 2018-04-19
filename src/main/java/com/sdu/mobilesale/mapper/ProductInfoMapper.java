package com.sdu.mobilesale.mapper;

import com.sdu.mobilesale.model.ProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "ProductInfoMapper")
@Mapper
public interface ProductInfoMapper {
    /**
     * 添加新商品
     * @param productInfo
     * @return
     */
    int addNewProduct(ProductInfo productInfo);

    /**
     * 列出产品列表
     * @param productType
     * @return
     */
    List<ProductInfo> productList(Integer productType);

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