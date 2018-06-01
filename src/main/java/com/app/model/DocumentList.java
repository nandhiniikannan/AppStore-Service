package com.app.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
public class DocumentList  {
	private String name;
	private String type;
	private boolean defaultValue;
	private String location;
}
