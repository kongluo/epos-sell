package com.kongluo.epossell.repository;

import com.kongluo.epossell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: epos-sell
 * @description:
 * @author: Mr.Wang
 * @create: 2018-09-20 08:11
 **/
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String>
{
    List<ProductInfo> findByProductStatus(Integer productStatus);

}
