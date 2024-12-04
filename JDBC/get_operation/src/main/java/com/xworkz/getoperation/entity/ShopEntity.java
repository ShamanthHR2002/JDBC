package com.xworkz.getoperation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "shop_table")
@NamedQuery(name = "findByShopBrandId", query = "SELECT s FROM ShopEntity s WHERE s.shopBrandId = 111")
@NamedQuery(name = "findByShopBrandName", query = "SELECT s FROM ShopEntity s WHERE s.shopBrandName = 'homefurnishh'")
@NamedQuery(name = "findByShopId", query = "SELECT s FROM ShopEntity s WHERE s.id = 34")
@NamedQuery(name = "findByShopBrandIdAndName", query = "SELECT s FROM ShopEntity s WHERE s.shopBrandId = 111 AND s.shopBrandName = 'homefurnishh'")
public class ShopEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int shopBrandId;

	private String shopBrandName;

	private double price;

	private String category;

	public ShopEntity() {

	}

	public ShopEntity(int shopBrandId, String shopBrandName, double price, String category) {
		super();
		this.shopBrandId = shopBrandId;
		this.shopBrandName = shopBrandName;
		this.price = price;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getShopBrandId() {
		return shopBrandId;
	}

	public void setShopBrandId(int shopBrandId) {
		this.shopBrandId = shopBrandId;
	}

	public String getShopBrandName() {
		return shopBrandName;
	}

	public void setShopBrandName(String shopBrandName) {
		this.shopBrandName = shopBrandName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "ShopEntity [id=" + id + ", shopBrandId=" + shopBrandId + ", shopBrandName=" + shopBrandName + ", price="
				+ price + ", category=" + category + "]";
	}
}
