package com.app.reactive.configuration;

import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;

public class MongoDbReactiveConfig extends AbstractReactiveMongoConfiguration  {

	@Override
	public MongoClient reactiveMongoClient() {
		// TODO Auto-generated method stub
		return MongoClients.create();
	}

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "mydb";
	}

}
