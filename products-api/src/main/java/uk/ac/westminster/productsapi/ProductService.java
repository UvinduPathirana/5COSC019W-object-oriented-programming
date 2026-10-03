package uk.ac.westminster.productsapi;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

	private final List<Product> products = new ArrayList<>();
	private long nextId = 1L;

	public ProductService() {
		products.add(new Product(1L, "Laptop", 999.99));
		nextId = 2L;
	}

	public List<Product> findAll() {
		return products;
	}

	public Product findById(Long id) {
		return products.stream()
				.filter(product -> product.getId().equals(id))
				.findFirst()
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));
	}

	public Product save(Product product) {
		if (product.getId() == null) {
			product.setId(nextId++);
		}
		products.add(product);
		return product;
	}

	public void deleteById(Long id) {
		if (!products.removeIf(product -> product.getId().equals(id))) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found");
		}
	}

}
