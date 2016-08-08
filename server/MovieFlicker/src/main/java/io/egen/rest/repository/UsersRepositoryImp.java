package io.egen.rest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.egen.rest.entity.Users;

@Repository
public class UsersRepositoryImp implements UsersRepository{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		TypedQuery<Users> query = em.createNamedQuery("Users.findAll", Users.class);
		return query.getResultList();
	}

	@Override
	public Users findOne(String id) {
		// TODO Auto-generated method stub
		return em.find(Users.class, id);
	}

	@Override
	public Users create(Users user) {
		// TODO Auto-generated method stub
		em.persist(user);
		return user;
	}

	@Override
	public Users update(Users user) {
		// TODO Auto-generated method stub
		return em.merge(user);
	}

	@Override
	public void delete(Users user) {
		// TODO Auto-generated method stub
		em.remove(user);
	}

	@Override
	public Users findByEmail(String email) {
		// TODO Auto-generated method stub
		TypedQuery<Users> query = em.createNamedQuery("Users.findByEmail", Users.class);
		query.setParameter("pEmail", email);
		List<Users> result = query.getResultList();
		if(result != null && result.size() == 1){
			return result.get(0);
		}
		return null;
	}

}
