package lt.ca.javau10;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lt.ca.javau10.repositories.ProductRepository;


@Component
public class DataLoader implements CommandLineRunner {

	 private final ProductRepository productRepository;

	    public DataLoader(ProductRepository productRepository) {
	        this.productRepository = productRepository;
	    }

	    public void run(String... args) throws Exception {
	     
	    	List<Product> products = List.of(
	    		    new Product("Kolagenas", "Papildai sąnarių sveikatai, 90 kapsulių, 1 kap. = 100 mg.", "Sveikatos papildai", 15.99),
	    		    new Product("Selenas", "Papildai plaukų stiprinimui, 90 kapsulių, 1 kap. = 100 mg.", "Sveikatos papildai", 19.99),
	    		    new Product("Ciberžolė", "Papildai kepenų sveikatai, 90 kapsulių, 1 kap. = 100 mg.", "Sveikatos papildai", 12.99),
	    		    new Product("Magnis", "Papildai nervinei sveikatai, 90 kapsulių, 1 kap. = 100 mg.", "Sveikatos papildai", 9.99),
	    		    new Product("Geležis", "Papildai kraujo stiprinimui, 90 kapsulių, 1 kap. = 100 mg.", "Sveikatos papildai", 10.99)
	    		    
	    		);

	    	
	    	 for (Product product : products) {
	             if (!productRepository.existsByName(product.getName())) {
	                 productRepository.save(product);
	             }
	         }
	    	

	            System.out.println("Produktai įkelti į duomenų bazę.");
	        }
	    }
	

