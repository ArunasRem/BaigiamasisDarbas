package lt.ca.javau10.controllers;



import java.util.ArrayList;
import java.util.List;

import lt.ca.javau10.Product;

public class Cart {

    private List<Product> products;
    private double totalPrice;

    public Cart() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void addProduct(Product product, int quantity) {
        product.setQuantity(quantity);
        this.products.add(product);
        calculateTotalPrice();
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
        calculateTotalPrice();
    }

    public void clearCart() {
        this.products.clear();
        this.totalPrice = 0.0;
    }

    private void calculateTotalPrice() {
        this.totalPrice = products.stream()
            .mapToDouble(p -> p.getPrice() * p.getQuantity())
            .sum();
    }
}
