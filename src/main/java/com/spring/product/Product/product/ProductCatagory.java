package com.spring.product.Product.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity 
public class ProductCatagory {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pcatagoryId;
	

	@Column(name="pcatagory")
	private String pcatagory;
	
	@Column(name="disc")
	private double disc;

	@Column(name="gst")
	private double gst;
	
	@Column(name="charge")
	private double deliveryCharge;

	public int getPcatagoryId() {
		return pcatagoryId;
	}

	public void setPcatagoryId(int pcatagoryId) {
		this.pcatagoryId = pcatagoryId;
	}

	public String getPcatagory() {
		return pcatagory;
	}

	public void setPcatagory(String pcatagory) {
		this.pcatagory = pcatagory;
	}

	public double getDisc() {
		return disc;
	}

	public void setDisc(double disc) {
		this.disc = disc;
	}

	public double getGst() {
		return gst;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}

	public double getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	/**
	 * @param pcatagoryId
	 * @param pcatagory
	 * @param disc
	 * @param gst
	 * @param deliveryCharge
	 */
	public ProductCatagory(int pcatagoryId, String pcatagory, double disc, double gst, double deliveryCharge) {
		super();
		this.pcatagoryId = pcatagoryId;
		this.pcatagory = pcatagory;
		this.disc = disc;
		this.gst = gst;
		this.deliveryCharge = deliveryCharge;
	}

	/**
	 * 
	 */
	public ProductCatagory() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@OneToOne(mappedBy = "pcatagoryId")
//	@JsonBackReference
//	private Product product;

	
	
}
