package com.simer.pojo;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix="imook.spring")
@PropertySource(value="classpath:resource.properties")
public class Resource implements Serializable{

	private String name;
	
	private String website;

	private String languare;
	
	public String getLanguare() {
		return languare;
	}

	public void setLanguare(String languare) {
		this.languare = languare;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}
