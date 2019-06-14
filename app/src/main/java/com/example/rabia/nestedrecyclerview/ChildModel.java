package com.example.rabia.nestedrecyclerview;

public class ChildModel {
    String  description;
    Integer image;

    public ChildModel(String description, Integer image) {
        this.description = description;
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public Integer getImage() {
        return image;
    }
}
