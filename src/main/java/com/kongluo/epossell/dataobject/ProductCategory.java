package com.kongluo.epossell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * @program: epos-sell
 * @description: 类目
 * @author: Mr.Wang
 * @create: 2018-09-18 15:02
 **/
@Entity
@DynamicUpdate
@Data
public class ProductCategory
{
    /*类目id.*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    /*类目名字.*/
    private String categoryName;

    /* 类目编号.*/
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
