package com.kongluo.epossell.service.impl;

import com.kongluo.epossell.dataobject.ProductInfo;
import com.kongluo.epossell.enums.ProductStatusEnum;
import com.kongluo.epossell.repository.ProductInfoRepository;
import com.kongluo.epossell.service.ProductService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @program: epos-sell
 * @description:
 * @author: Mr.Wang
 * @create: 2018-09-20 08:35
 **/
@Service
public class ProductServiceImpl implements ProductService
{

    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId(productId);
        Example<ProductInfo> infoExample = Example.of(productInfo);
        Optional<ProductInfo> repositoryOne = repository.findOne(infoExample);

        return repositoryOne.get();
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }
}
