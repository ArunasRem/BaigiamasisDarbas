package lt.ca.javau10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lt.ca.javau10.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	boolean existsByName(String name);
	
}
	

