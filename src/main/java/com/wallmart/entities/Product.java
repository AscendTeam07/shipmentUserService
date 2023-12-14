package com.wallmart.entities;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "products")
	public class Product {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private ObjectId id;
	    private int productId;
	    private String title;
	    private int minQuantity;
	    private String gender;
	    private String iconUrl;
	    private String shortDescription;
	    private String longDescription;
	    private String productName;
	    private String productCategory;
	    private String inventoryStatus;
	    private int availableQuantity;
	    private String purchasable;
	
	    @ElementCollection
	    private List<String> searchTags;
	
	    private String model;
	    private String brand;
	    private String specification;
	    private int warrantyDuration;
	
	    @ElementCollection
	    private List<String> imageUrls;
	
	    private int orderLimit;
	    private int returnDates;
	    private double length;
	    private double width;
	    private double height;
	    private double weight;
	
	    @ElementCollection
	    @CollectionTable(name = "product_comments")
	    private List<Comment> comments;
	
	    private boolean isEligibleForPromotion;
	    private double discount;
	    private String isHazardous;
	    private String isReturnable;
	    
	    
	    @Embeddable
	    public static class Comment {
	        private String userId;
	        private String comment;
	        private int rate;

	    }

		public ObjectId getId() {
			return id;
		}

		public void setId(ObjectId id) {
			this.id = id;
		}

		

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getMinQuantity() {
			return minQuantity;
		}

		public void setMinQuantity(int minQuantity) {
			this.minQuantity = minQuantity;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getIconUrl() {
			return iconUrl;
		}

		public void setIconUrl(String iconUrl) {
			this.iconUrl = iconUrl;
		}

		public String getShortDescription() {
			return shortDescription;
		}

		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}

		public String getLongDescription() {
			return longDescription;
		}

		public void setLongDescription(String longDescription) {
			this.longDescription = longDescription;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductCategory() {
			return productCategory;
		}

		public void setProductCategory(String productCategory) {
			this.productCategory = productCategory;
		}

		public String getInventoryStatus() {
			return inventoryStatus;
		}

		public void setInventoryStatus(String inventoryStatus) {
			this.inventoryStatus = inventoryStatus;
		}

		public int getAvailableQuantity() {
			return availableQuantity;
		}

		public void setAvailableQuantity(int availableQuantity) {
			this.availableQuantity = availableQuantity;
		}

		public String getPurchasable() {
			return purchasable;
		}

		public void setPurchasable(String purchasable) {
			this.purchasable = purchasable;
		}

		public List<String> getSearchTags() {
			return searchTags;
		}

		public void setSearchTags(List<String> searchTags) {
			this.searchTags = searchTags;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getSpecification() {
			return specification;
		}

		public void setSpecification(String specification) {
			this.specification = specification;
		}

		public int getWarrantyDuration() {
			return warrantyDuration;
		}

		public void setWarrantyDuration(int warrantyDuration) {
			this.warrantyDuration = warrantyDuration;
		}

		public List<String> getImageUrls() {
			return imageUrls;
		}

		public void setImageUrls(List<String> imageUrls) {
			this.imageUrls = imageUrls;
		}

		public int getOrderLimit() {
			return orderLimit;
		}

		public void setOrderLimit(int orderLimit) {
			this.orderLimit = orderLimit;
		}

		public int getReturnDates() {
			return returnDates;
		}

		public void setReturnDates(int returnDates) {
			this.returnDates = returnDates;
		}

		public double getLength() {
			return length;
		}

		public void setLength(double length) {
			this.length = length;
		}

		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public List<Comment> getComments() {
			return comments;
		}

		public void setComments(List<Comment> comments) {
			this.comments = comments;
		}

		public boolean isEligibleForPromotion() {
			return isEligibleForPromotion;
		}

		public void setEligibleForPromotion(boolean isEligibleForPromotion) {
			this.isEligibleForPromotion = isEligibleForPromotion;
		}

		public double getDiscount() {
			return discount;
		}

		public void setDiscount(double discount) {
			this.discount = discount;
		}

		public String getIsHazardous() {
			return isHazardous;
		}

		public void setIsHazardous(String isHazardous) {
			this.isHazardous = isHazardous;
		}

		public String getIsReturnable() {
			return isReturnable;
		}

		public void setIsReturnable(String isReturnable) {
			this.isReturnable = isReturnable;
		}
	    
	    

	}

