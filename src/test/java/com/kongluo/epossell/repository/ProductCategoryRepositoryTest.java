package com.kongluo.epossell.repository;

import com.kongluo.epossell.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;
    
    @Test
    public void findOneTest(){
        List<ProductCategory> productCategorys = repository.findAll();
        System.out.println(productCategorys.get(0).toString());
    }

    @Test
    @Transactional // 该注解可以不将测试数据写入到数据库(原因因为测试)
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("男生最爱",4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null,result);
    }

    @Test
    public void saveTest2(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        Example<ProductCategory> example = Example.of(productCategory);
        Optional<ProductCategory> repositoryOne = repository.findOne(example);

        if (repositoryOne.isPresent()){
            ProductCategory productCategoryResult = repositoryOne.get();
            productCategoryResult.setCategoryType(10);
            repository.save(productCategoryResult);
        }
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = this.repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }


}