package com.app.model;

import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "UserModel")
public class UserPojo {
	@TextIndexed
	private String id;
	private String username;
	private String password;
}
