package com.mynewshop.mynewshopapp.model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="shippingid")
    private Integer shippingid;
    @Column(name="userid")
    private Integer userid;
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="pincode")
    private String pincode;
    @Column(name="totalmt")
    private Integer totalmt;
    @Column(name="order_id")
    private Integer orderId;

    public Shipping() {}

    public Shipping(Integer userid, String address, String city, String state, String pincode, Integer totalmt, Integer orderId) {
        this.userid = userid;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.totalmt = totalmt;
        this.orderId = orderId;
    }

    public Integer getShippingid() {
        return shippingid;
    }

    public void setShippingid(Integer shippingid) {
        this.shippingid = shippingid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Integer getTotalmt() {
        return totalmt;
    }

    public void setTotalmt(Integer totalmt) {
        this.totalmt = totalmt;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Shipping{" +
                "shippingid=" + shippingid +
                ", userid=" + userid +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode='" + pincode + '\'' +
                ", totalmt=" + totalmt +
                ", orderId=" + orderId +
                '}';
    }
}
