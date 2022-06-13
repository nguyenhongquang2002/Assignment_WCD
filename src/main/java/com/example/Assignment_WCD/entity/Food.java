package com.example.Assignment_WCD.entity;

import com.example.Assignment_WCD.entity.base.BaseEntity;
import com.example.Assignment_WCD.entity.statusEnum.FoodStatus;

import java.time.LocalDateTime;

public class Food extends BaseEntity {
    private int id;
    private String namefood;
    private String categoryid;
    private String description;
    private String thumbnail;
    private double price;

    public Food(String namefood, String thumbnail, Double price, String description) {
        this.namefood = "";
        this.categoryid = "";
        this.description = "";
        this.thumbnail = "";
    }

    public Food(String namefood, String categoryid, String description, String thumbnail, double price) {
        this.namefood = namefood;
        this.categoryid = categoryid;
        this.description = description;
        this.thumbnail = thumbnail;
        this.price = price;
    }

    public Food(int id, String namefood, String categoryid, String description, String thumbnail, double price) {
        this.id = id;
        this.namefood = namefood;
        this.categoryid = categoryid;
        this.description = description;
        this.thumbnail = thumbnail;
        this.price = price;
    }

    public Food(int id, String namefood, String description, double price, String thumbnail, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, int createdBy, int updatedBy, int deletedBy, FoodStatus foodStatus) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamefood() {
        return namefood;
    }

    public void setNamefood(String namefood) {
        this.namefood = namefood;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
