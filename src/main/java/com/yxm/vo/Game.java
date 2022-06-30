package com.yxm.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * 游戏对象
 */
public class Game {
    private Integer id;
    private String name;
    private Integer categoryId;//游戏分类
    private Integer platformId;//游戏平台
    private Double price;//游戏价格

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pubdate;
    private String description;//游戏描述
    private Category category;
    private Platform platform;
    private List<Picture> pictures;//游戏介绍截图
    private List<Review> reviews;//游戏评论
    private String src;//游戏路径
    private String details;//游戏详情

    public Game(String src) {
        this.src = src;
    }

    public Game(String src, Integer id) {
        this.src = src;
        this.id = id;
    }


    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Game() {
    }

    public Game(Integer id) {
        this.id = id;
    }

    public Game(Integer categoryId, Integer platformId) {
        this.categoryId = categoryId;
        this.platformId = platformId;
    }

    public Game(String name, Integer categoryId, Integer platformId) {
        this.name = name;
        this.categoryId = categoryId;
        this.platformId = platformId;
    }

    public Game(String name, Integer categoryId, Integer platformId, Double price, Date pubdate, String description) {
        this.name = name;
        this.categoryId = categoryId;
        this.platformId = platformId;
        this.price = price;
        this.pubdate = pubdate;
        this.description = description;
    }

    public Game(Integer id, String name, Integer categoryId, Integer platformId, Double price, Date pubdate, String description) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.platformId = platformId;
        this.price = price;
        this.pubdate = pubdate;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
