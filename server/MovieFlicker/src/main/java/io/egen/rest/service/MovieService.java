package io.egen.rest.service;

import java.util.List;

import io.egen.rest.entity.Movies;

public interface MovieService {

	public List<Movies> findAll();
	public Movies findOne(String id);
	public Movies create(Movies movie);
	public Movies update(String id, Movies movie);
	public void delete(String id);
	
}
