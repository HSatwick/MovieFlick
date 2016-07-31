package io.egen.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="movies_director")
public class Movie_Director {
	
	@Id
	@GenericGenerator(name="customUUID", strategy="uuid2")
	@GeneratedValue(generator="customUUID")
	private String id;
	
	@ManyToOne
	private Movies movie;
	
	@ManyToOne
	private Directors director;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Movies getMovie() {
		return movie;
	}

	public void setMovie(Movies movie) {
		this.movie = movie;
	}

	public Directors getDirector() {
		return director;
	}

	public void setDirector(Directors director) {
		this.director = director;
	}

}
