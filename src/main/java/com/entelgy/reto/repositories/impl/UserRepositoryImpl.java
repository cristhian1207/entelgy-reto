package com.entelgy.reto.repositories.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entelgy.reto.constants.ApiEndpoints;
import com.entelgy.reto.entities.User;
import com.entelgy.reto.repositories.IUserRepository;
import com.entelgy.reto.repositories.requests.UserRequest;

@Service
public class UserRepositoryImpl implements IUserRepository {

	@Autowired
    RestTemplate restTemplate;

	@Autowired
	ApiEndpoints apiEndpoints;

	@Override
	public List<User> findAll() {
		UserRequest userRequest = this.restTemplate.getForObject(this.apiEndpoints.regressUsers, UserRequest.class);
		List<User> users = userRequest.getData();
		return users;
	}

}
