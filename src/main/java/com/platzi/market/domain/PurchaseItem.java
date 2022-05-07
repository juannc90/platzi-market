package com.platzi.market.domain;

public class PurchaseItem {
    //Id del producto que se está incluyendo dentro de la compra
    private int productId;
    private int quantity;
    //Total es el valor del producto por la cantidad
    private double total;
    //Si el producto está dentro de la compra
    private boolean active;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
