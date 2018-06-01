package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.AppStore;
import com.app.model.UserPojo;
import com.app.repository.MongoRepository;

import reactor.core.publisher.Flux;

@Service
public class MongoServiceImpl implements MongoService {

	@Autowired
	private MongoRepository rep;

	public Flux<AppStore> findAll() {
		return rep.findAll();
	}

}
