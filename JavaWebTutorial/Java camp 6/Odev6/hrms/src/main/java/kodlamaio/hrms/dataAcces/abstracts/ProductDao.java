package kodlamaio.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Product;

public interface ProductDao  extends JpaRepository<Product, Integer>{

	
	
	
}
