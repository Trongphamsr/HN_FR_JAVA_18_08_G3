/**
 * 
 */
package com.fsoft.project.entity;

/**
 * @author hungcoutinho
 *
 */
public class Product {

	private int id;
	private String productName;
	private String imagePath;
	private ManuFacturer manuFacturer;
	private Category category;

	public Product() {
		super();
	}

	public Product(int id, String productName, String imagePath, ManuFacturer manuFacturer, Category category) {
		super();
		this.id = id;
		this.productName = productName;
		this.imagePath = imagePath;
		this.manuFacturer = manuFacturer;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public ManuFacturer getManuFacturer() {
		return manuFacturer;
	}

	public void setManuFacturer(ManuFacturer manuFacturer) {
		this.manuFacturer = manuFacturer;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
