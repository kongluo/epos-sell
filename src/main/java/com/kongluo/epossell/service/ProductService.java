package com.kongluo.epossell.service;

import com.kongluo.epossell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
/**
* @description: 商品
* @param:
* @author: richard.wang
* @date: 2018/9/20 8:33
* @version: v1.0
*/
public interface ProductService
{
    ProductInfo findOne(String productId);

    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
