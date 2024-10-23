
package lt.ca.javau10.services;

import org.springframework.stereotype.Service;

import lt.ca.javau10.Product;
import lt.ca.javau10.controllers.Cart;


@Service
public class CartService {

    private Cart cart;

    public CartService() {
        this.cart = new Cart(); // Initialize a new cart
    }

    public Cart getCart() {
        return cart;
    }

    public Cart addProductToCart(Product product, int quantity) {
        cart.addProduct(product, quantity);
        return cart;
    }

    public Cart removeProductFromCart(Product product) {
        cart.removeProduct(product);
        return cart;
    }

    public Cart clearCart() {
        cart.clearCart();
        return cart;
    }

	public Cart removeProductFromCart(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}
}
