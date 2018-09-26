package com.kongluo.epossell.service;

import com.kongluo.epossell.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService
{
   ProductCategory findOne(Integer categoryId);

   List<ProductCategory> findAll();

   List<ProductCategory> findByCategoryTypeIn(List<Integer> categorytypeList);

   ProductCategory save(ProductCategory productCategory);
}
