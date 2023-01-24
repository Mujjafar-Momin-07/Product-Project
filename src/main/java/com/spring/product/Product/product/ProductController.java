package com.spring.product.Product.product;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private ProductService service = null;

	// get details of product
	@GetMapping("/product")
	public List<Product> getProduct() {
		return this.service.getAllproducts();
	}

	// get details of specific product
	@GetMapping("/product/{productId}")
	public Product getProductById(@PathVariable("productId") int productId) {
		return this.service.getProduct(productId);

	}

	// add details of product
	@PostMapping("/product")
		public void addProductDetails(@RequestBody Product p ) {
			
			this.service.addProduct(p);
			
		}

	// update details of existing product
	@PutMapping("/product/{productId}")
	public void updateProductDetails(@RequestBody Product p, @PathVariable int productId) {
		this.service.updateProduct(productId, p);
	}

	// delete details of product
	@DeleteMapping("/product/{productId}")
	public void deleteProductDetails(@PathVariable int productId) {
		this.service.deleteProduct(productId);
	}

}
