package com.liumapp.demo.sdk.client.entity.open;

import com.liumapp.demo.sdk.client.entity.OpenStrategy;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author liumapp
 * @file BackUpTradeDetail.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/25/18
 */
public class BackUpTradeDetail extends OpenStrategy implements Serializable {

    private Long orderId;

    private Long userId;

    private String name;

    private String products;

    private BigDecimal price;

    private String province;

    private String city;

    private String area;

    public BackUpTradeDetail() {

    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
