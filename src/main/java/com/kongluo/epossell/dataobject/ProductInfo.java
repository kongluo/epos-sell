package com.kongluo.epossell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @program: epos-sell
 * @description: 商品
 * @author: Mr.Wang
 * @create: 2018-09-20 08:01
 **/
@Entity
@DynamicUpdate
@Data
public class ProductInfo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productId;
    /* 名字 */
    private String productName;
    /* 单价 */
    private BigDecimal productPrice;
    /* 库存 */
    private Integer productStock;
    /* 描述 */
    private String productDescription;
    /* 小图 */
    private String productIcon;
    /* 状态，0正常1下架 */
    private Integer productStatus;
    /* 类目编号 */
    private Integer categoryType;
}
