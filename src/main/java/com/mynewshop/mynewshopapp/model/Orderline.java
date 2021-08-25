package com.mynewshop.mynewshopapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Orderline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_line_item_id")
    private Integer orderLineItemId;
    @Column(name = "line_id")
    private Integer LineId;
    @Column(name = "order_line_item_status")
    private String orderLineItemStatus;
    @Column(name = "price")
    private Integer price;
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "discountId")
    private Integer discountId;
    @Column(name = "reason_of_cancel")
    private String reasonOfCancel;
    @Column(name = "product_id")
    private Integer productId;



    public Orderline() {}

    public Orderline(Integer lineId, String orderLineItemStatus, Integer price, Integer orderId, Integer quantity, Integer discountId, String reasonOfCancel, Integer productId) {
        LineId = lineId;
        this.orderLineItemStatus = orderLineItemStatus;
        this.price = price;
        this.orderId = orderId;
        this.quantity = quantity;
        this.discountId = discountId;
        this.reasonOfCancel = reasonOfCancel;
        this.productId = productId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOrderLineItemId() {
        return orderLineItemId;
    }

    public void setOrderLineItemId(Integer orderLineItemId) {
        this.orderLineItemId = orderLineItemId;
    }

    public Integer getLineId() {
        return LineId;
    }

    public void setLineId(Integer lineId) {
        LineId = lineId;
    }

    public String getOrderLineItemStatus() {
        return orderLineItemStatus;
    }

    public void setOrderLineItemStatus(String orderLineItemStatus) {
        this.orderLineItemStatus = orderLineItemStatus;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Integer discountId) {
        this.discountId = discountId;
    }

    public String getReasonOfCancel() {
        return reasonOfCancel;
    }

    public void setReasonOfCancel(String reasonOfCancel) {
        this.reasonOfCancel = reasonOfCancel;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Orderline{" +
                "orderLineItemId=" + orderLineItemId +
                ", LineId=" + LineId +
                ", orderLineItemStatus='" + orderLineItemStatus + '\'' +
                ", price=" + price +
                ", orderId=" + orderId +
                ", quantity=" + quantity +
                ", discountId=" + discountId +
                ", reasonOfCancel='" + reasonOfCancel + '\'' +
                ", productId=" + productId +
                '}';
    }
}
