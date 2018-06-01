package com.app.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.AppStore;

import reactor.core.publisher.Mono;

@Repository
public interface MongoRepository extends ReactiveCrudRepository<AppStore, String> {
	Mono<AppStore> findByName(String name);
 
}
