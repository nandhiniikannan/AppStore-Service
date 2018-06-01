package com.app.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
public class Logo {
private String mimetype;
private List<String> metadata;
private String value;
}
