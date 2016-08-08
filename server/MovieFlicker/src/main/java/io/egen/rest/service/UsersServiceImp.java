package io.egen.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.egen.rest.entity.Users;
import io.egen.rest.repository.UsersRepository;

@Service
public class UsersServiceImp implements UserService{

	@Autowired
	UsersRepository user_repo;
	
	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return user_repo.findAll();
	}

	@Override
	public Users findOne(String id) {
		// TODO Auto-generated method stub
		return user_repo.findOne(id);
	}

	@Override
	@Transactional
	public Users create(Users user) {
		// TODO Auto-generated method stub
		Users u = user_repo.findByEmail(user.getEmail());
		if(u != null){
			return null;
		}
		return user_repo.create(user);
	}

	@Override
	@Transactional
	public Users update(String id, Users user) {
		// TODO Auto-generated method stub
		Users u = user_repo.findOne(id);
		if(u == null){
			return null;
		}
		return user_repo.update(user);
	}

	@Override
	@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
		Users u = user_repo.findOne(id);
		if(u == null){
		}
		user_repo.delete(u);
	}

}
