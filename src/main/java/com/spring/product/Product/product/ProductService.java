package com.spring.product.Product.product;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	
	@Autowired
	private ProductRepository repository;
	
	//Product product=new Product();

	// GET ALL PRODUCTS
	public List<Product> getAllproducts() {
		List<Product> productList= (List<Product>) this.repository.findAll();
		return productList;

	}

	// GET SPECIFIED PRODUCT
	public Product getProduct(int productId) {
		Product p=this.repository.findById(productId).orElse(null);
		return p;
	}

	@Transactional
	public void addProduct(Product p ) {
		p.setFinalprice(p.getBasePrice()+p.catagory.getDeliveryCharge()+(p.catagory.getGst()*p.getBasePrice()*0.001)-(p.catagory.getDisc()*p.getBasePrice()*0.001));
		
		this.repository.save(p);
	}

	public void updateProduct(int productId, Product p) {
		this.repository.save(p);		
	}

	public void deleteProduct(int productId) {
		this.repository.deleteById(productId);
	}

}
