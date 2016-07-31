package io.egen.rest.repository;

import java.util.List;

import io.egen.rest.entity.Users;

public interface UsersRepository {
	public List<Users> findAll();
	public Users findOne(String id);
	public Users findByEmail(String email);
	public Users create(Users user);
	public Users update(Users user);
	public void delete(Users user);
}
