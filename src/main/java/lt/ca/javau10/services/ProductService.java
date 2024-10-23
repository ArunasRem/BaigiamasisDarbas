package lt.ca.javau10.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lt.ca.javau10.Product;
import lt.ca.javau10.repositories.ProductRepository;

@Service
public class ProductService {

	
	 private final ProductRepository productRepository;

	    public ProductService(ProductRepository productRepository) {
	        this.productRepository = productRepository;
	    }

	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }

	    public Product saveProduct(Product product) {
	        return productRepository.save(product);
	    }

	    public Product getProductById(Long id) {
	        return productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));
	    }

	    public void deleteProduct(Long id) {
	        productRepository.deleteById(id);
	    }
	    
}

