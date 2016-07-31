package io.egen.rest.service;

import java.util.*;

import io.egen.rest.entity.Users;

public interface UserService {
	public List<Users> findAll();
	public Users findOne(String id);
	public Users create(Users user);
	public Users update(String id, Users user);
	public void delete(String id);
}
