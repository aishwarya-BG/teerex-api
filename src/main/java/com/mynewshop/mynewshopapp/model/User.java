package com.mynewshop.mynewshopapp.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userId;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="role")
    private String role;
    @Column(name="email")
    private String email;
    @Column(name="isactive")
    private Integer isactive;
    @Column(name="is_prime")
    private Integer isPrime;
    @Column(name="user_img")
    private byte[] userImg;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "user_id")
    private List<Orderlist> orderlists;

    public User()
    {

    }

    public User(String username, String password, String role, String email, Integer isactive, Integer is_prime, byte[] user_img) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
        this.isactive = isactive;
        this.isPrime = is_prime;
        this.userImg = user_img;
    }

    public List<Orderlist> getOrderlists() {
        return orderlists;
    }

    public void setOrderlists(List<Orderlist> orderlists) {
        this.orderlists = orderlists;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public Integer getIsactive() {
        return isactive;
    }

    public Integer getIsPrime() {
        return isPrime;
    }

    public byte[] getUserImg() {
        return userImg;
    }

    public void setUserId(Integer user_id) {
        this.userId = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }

    public void setIsPrime(Integer is_prime) {
        this.isPrime = is_prime;
    }

    public void setUserImg(byte[] user_img) {
        this.userImg = user_img;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                ", isactive=" + isactive +
                ", is_prime=" + isPrime +
                ", user_img=" + Arrays.toString(userImg) +
                '}';
    }
}
