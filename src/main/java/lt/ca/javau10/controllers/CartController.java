package lt.ca.javau10.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lt.ca.javau10.Product;
import lt.ca.javau10.services.CartService;
import lt.ca.javau10.services.ProductService;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private ProductService productService;

    @PostMapping("/add/{productId}")
    public Cart addToCart(@PathVariable Long productId, @RequestBody int quantity) {
        Product product = productService.getProductById(productId);
        return cartService.addProductToCart(product, quantity);
    }

    @DeleteMapping("/remove/{productId}")
    public Cart removeFromCart(@PathVariable Long productId) {
        return cartService.removeProductFromCart(productId);
    }

    @PostMapping("/checkout")
    public String checkout() {
        cartService.clearCart();
        return "Ačiū už pirkimą!";
    }
}
