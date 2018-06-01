package com.app.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "AppStore")
public class AppStore  {
	private String name;
	private String description;
	private String createdby;
	private List<String> industry;
	private List<String> tags;
	private List<DocumentList> marketingMaterial;
	private Logo logo;
	private boolean inProduction;
	private String nullValue;
	private int version;
}
