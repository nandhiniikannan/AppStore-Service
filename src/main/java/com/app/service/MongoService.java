package com.app.service;

import com.app.model.AppStore;

import reactor.core.publisher.Flux;

public interface MongoService {
Flux<AppStore> findAll();
}
