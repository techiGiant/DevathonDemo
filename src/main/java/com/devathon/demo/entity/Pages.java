package com.devathon.demo.entity;

import org.springframework.data.annotation.Id;

import com.devathon.demo.models.Members;

public class Pages {
	@Id
	private String Id;
	
	private String pageTitle;
	private String pageContent;
	private Members[] members;
	
	public Pages(String pageTitle, String pageContent, Members[] members) {
		super();
		this.pageTitle = pageTitle;
		this.pageContent = pageContent;
		this.members = members;
	}

	public Pages() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public String getPageContent() {
		return pageContent;
	}

	public void setPageContent(String pageContent) {
		this.pageContent = pageContent;
	}

	public Members[] getMembers() {
		return members;
	}

	public void setMembers(Members[] members) {
		this.members = members;
	}
	
	
	
}
