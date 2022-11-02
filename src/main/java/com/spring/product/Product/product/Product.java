package com.spring.product.Product.product;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "product_data")
public class Product {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "product_id")
	private int productId;

//	@Column(name = "product_name")
	private String name;
	
//	@Column(name = "product_type")
	private String productType;
	
//	@Column(name = "basePrice")
	private double basePrice;
	

//	@JoinColumn(name="pcatagoryId",referencedColumnName = "pcatagoryId")
//	@JsonManagedReference

	@Autowired
	@OneToOne(cascade = CascadeType.ALL)
	ProductCatagory catagory;
	
	private double finalprice;

	/**
	 * @param productId
	 * @param name
	 * @param productType
	 * @param basePrice
	 * @param catagory
	 * @param finalprice
	 */
	public Product(int productId, String name, String productType, double basePrice, ProductCatagory catagory,
			double finalprice) {
		super();
		this.productId = productId;
		this.name = name;
		this.productType = productType;
		this.basePrice = basePrice;
		this.catagory = catagory;
		this.finalprice = finalprice;
	}

	/**
	 * 
	 */
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public ProductCatagory getCatagory() {
		return catagory;
	}

	public void setCatagory(ProductCatagory catagory) {
		this.catagory = catagory;
	}

	public double getFinalprice() {
		return finalprice;
	}

	public void setFinalprice(double finalprice) {
		this.finalprice = finalprice;
	}

	
}
