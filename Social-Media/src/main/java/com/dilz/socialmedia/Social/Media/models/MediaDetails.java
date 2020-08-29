package com.dilz.socialmedia.Social.Media.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mediaInfo")
public class MediaDetails {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
