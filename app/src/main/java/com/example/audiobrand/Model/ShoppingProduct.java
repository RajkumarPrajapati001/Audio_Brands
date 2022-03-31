package com.example.audiobrand.Model;

public class ShoppingProduct {
    private int ProductImage;
    private  String ProductName,ProductType,ProductPrice;

    public ShoppingProduct(int productImage, String productName, String productType, String productPrice) {
        ProductImage = productImage;
        ProductName = productName;
        ProductType = productType;
        ProductPrice = productPrice;
    }

    public int getProductImage() {
        return ProductImage;
    }

    public void setProductImage(int productImage) {
        ProductImage = productImage;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String productType) {
        ProductType = productType;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String productPrice) {
        ProductPrice = productPrice;
    }
}
