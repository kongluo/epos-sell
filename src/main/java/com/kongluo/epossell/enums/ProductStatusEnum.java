package com.kongluo.epossell.enums;

import lombok.Getter;

/**
 * @program: epos-sell
 * @description: 商品状态
 * @author: Mr.Wang
 * @create: 2018-09-20 08:39
 **/
@Getter
public enum  ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message=message;
    }


}
