package com.devathon.demo.models;

public class Members {
	
	private int seqNo;
	private String name;
	private String description;
	private String imageUrl;
	
	public Members(int seqNo, String name, String description, String imageUrl) {
		super();
		this.seqNo = seqNo;
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
	}

	public Members() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "Members [seqNo=" + seqNo + ", name=" + name + ", description=" + description + ", imageUrl=" + imageUrl
				+ "]";
	}
	
}
