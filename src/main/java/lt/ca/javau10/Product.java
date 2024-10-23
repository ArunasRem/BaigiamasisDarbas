package lt.ca.javau10;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




	@Entity
	@Table(name = "products")
	

	public class Product {

	
	
	 public Product(String name, String description, String category, double price) {
			super();
			this.name = name;
			this.description = description;    //constructors
			this.category = category;
			this.price = price;
		}
	 public Product() {
		
	 	}
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String description;
	    private String category;
	    private double price;
	    
	    
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;                 // Getters and Setters
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public double getQuantity() {
			// TODO Auto-generated method stub
			return 0;
		}
		public void setQuantity(int quantity) {
			// TODO Auto-generated method stub
			
		}

	   
	}
	
	

