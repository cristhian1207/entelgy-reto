package com.entelgy.reto.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entelgy.reto.entities.User;
import com.entelgy.reto.repositories.IUserRepository;
import com.entelgy.reto.services.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	private static final String RESPONSE_DATA_KEY = "data";
	private static final String RESPONSE_DATA_DELIMITER = "|";
	
	@Autowired
	private IUserRepository userRepository;
	
	@Override
	public Map<String, Object> usersData() {
		Map<String, Object> response = new HashMap<>();
		List<User> users = this.userRepository.findAll();

		List<String> usersData = new ArrayList<>();
		for (User user : users) {
			String userData = user.getId() + RESPONSE_DATA_DELIMITER + user.getLast_name() + RESPONSE_DATA_DELIMITER + user.getEmail(); 
			usersData.add(userData);
		}
		response.put(RESPONSE_DATA_KEY, usersData);
		return response;
	}

}
