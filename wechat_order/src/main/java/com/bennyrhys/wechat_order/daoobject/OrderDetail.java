package com.bennyrhys.wechat_order.daoobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 订单详情
 * @Author bennyrhys
 * @Date 2020-06-28 08:09
 */
@Entity
@Data
public class OrderDetail {
//    订单详情id
    @Id
    private String detailId;
//    订单id
    private String orderId;
//    商品id
    private String productId;
//    商品名称
    private String productName;
//    商品价格
    private BigDecimal productPrice;
//    商品数量
    private Integer productQuantity;
//    商品小图
    private String productIcon;
}