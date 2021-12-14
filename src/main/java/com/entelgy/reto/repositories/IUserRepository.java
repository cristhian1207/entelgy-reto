package com.entelgy.reto.repositories;

import java.util.List;

import com.entelgy.reto.entities.User;

public interface IUserRepository {
	public List<User> findAll();
}
