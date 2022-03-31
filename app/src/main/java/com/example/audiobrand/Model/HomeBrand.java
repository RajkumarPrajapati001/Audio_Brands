package com.example.audiobrand.Model;

public class HomeBrand {
    private int ItemImage;
    private String ItemName;

    public HomeBrand(int itemImage, String itemName) {
        ItemImage = itemImage;
        ItemName = itemName;
    }

    public int getItemImage() {
        return ItemImage;
    }

    public void setItemImage(int itemImage) {
        ItemImage = itemImage;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }
}
