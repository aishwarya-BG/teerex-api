package com.mynewshop.mynewshopapp.model;

import javax.persistence.*;


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
    private Integer totalamt;
    @Column(name="orderid")
    private Integer orderid;

    public Shipping(Integer userid, String address, String city, String state, String pincode, Integer totalamt, Integer orderid) {
        this.userid = userid;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.totalamt = totalamt;
        this.orderid = orderid;
    }

    public Shipping() {}

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

    public Integer getTotalamt() {
        return totalamt;
    }

    public void setTotalamt(Integer totalamt) {
        this.totalamt = totalamt;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
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
                ", totalamt=" + totalamt +
                ", orderid=" + orderid +
                '}';
    }
}
