package com.devathon.demo.entity;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Services {
	@Id
	private String Id;
	
	public String serviceId;
	public String title;
	public String subTitle;
	public String shortDesc;
	public String longDesc;
	public String category;
	public String imagePath;
	public String cost;
	public List<String> packages;
	
	public Services(String serviceId, String title, String subTitle, String shortDesc, String longDesc, String category,
			String imagePath, String cost, List<String> packages ) {
		super();
		this.serviceId = serviceId;
		this.title = title;
		this.subTitle = subTitle;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
		this.category = category;
		this.imagePath = imagePath;
		this.cost = cost;
		this.packages = packages;
	}
	
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<String> getPackages() {
		return packages;
	}

	public void setPackages(List<String> packages) {
		this.packages = packages;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	public String getLongDesc() {
		return longDesc;
	}
	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}	
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Services [Id=" + Id + ", serviceId=" + serviceId + ", title=" + title + ", subTitle=" + subTitle
				+ ", shortDesc=" + shortDesc + ", longDesc=" + longDesc + ", category=" + category + ", imagePath="
				+ imagePath + ", cost=" + cost + ", packages=" + packages + "]";
	}

}
