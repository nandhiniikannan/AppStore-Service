package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.AppStore;
import com.app.model.UserPojo;
import com.app.repository.MongoRepository;

import ch.qos.logback.core.net.SyslogOutputStream;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin
@RestController
public class UserController {

	@Autowired
    private MongoRepository dao;

   
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Mono<AppStore> getByName() {
		System.out.println("------------------->");
		dao.findByName("Sofia").subscribe(person -> System.out.println("GET: " + person));
        return dao.findByName("Sofia");
    }
	

	@RequestMapping(value = "/all/apps", method = RequestMethod.GET)
    public Flux<AppStore> getAll() {
        return dao.findAll();
    }
	
}
