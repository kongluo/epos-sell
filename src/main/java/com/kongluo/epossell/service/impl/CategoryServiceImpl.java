package com.kongluo.epossell.service.impl;

import com.kongluo.epossell.dataobject.ProductCategory;
import com.kongluo.epossell.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @program: epos-sell
 * @description: 类目
 * @author: Mr.Wang
 * @create: 2018-09-18 16:31
 **/
@Service
public class CategoryServiceImpl implements com.kongluo.epossell.service.CategoryService
{
    @Autowired
    ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(categoryId);
        Example<ProductCategory> categoryExample = Example.of(productCategory);
        Optional<ProductCategory> repositoryOne = repository.findOne(categoryExample);
        ProductCategory productResult = repositoryOne.get();
        return productResult;
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categorytypeList) {
        return repository.findByCategoryTypeIn(categorytypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
