package io.egen.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="movies")
@NamedQueries({
	@NamedQuery(name="Movies.findAll", query="select m from Movies m order by m.title asc"),
	@NamedQuery(name="Movies.findByTitle", query="select m from Movies m where m.title=:pTitle")
})
public class Movies {
	
	@Id
	@GenericGenerator(name="customUUID", strategy="uuid2")
	@GeneratedValue(generator="customUUID")
	private String id;
	
	@Column(unique = true)
	private String title;
	
	private String yearLaunched;
	
	private String yearEnded;
	
	private String rated;
	
	private String runtime;
	
	private String plot;
	
	private String released;
	
	private String posterPic;
	
	private String programType;
	
	private String awards;
	
	private String metaScore;
	
	private String imdbRating;
	
	private String imdbVotes;
	
	private String imdbID;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRated() {
		return rated;
	}

	public void setRated(String rated) {
		this.rated = rated;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getReleased() {
		return released;
	}

	public void setReleased(String released) {
		this.released = released;
	}

	public String getYearLaunched() {
		return yearLaunched;
	}

	public void setYearLaunched(String yearLaunched) {
		this.yearLaunched = yearLaunched;
	}

	public String getYearEnded() {
		return yearEnded;
	}

	public void setYearEnded(String yearEnded) {
		this.yearEnded = yearEnded;
	}

	public String getPosterPic() {
		return posterPic;
	}

	public void setPosterPic(String posterPic) {
		this.posterPic = posterPic;
	}
	public String getProgramType() {
		return programType;
	}
	public void setProgramType(String programType) {
		this.programType = programType;
	}
	public String getMetaScore() {
		return metaScore;
	}
	public void setMetaScore(String metaScore) {
		this.metaScore = metaScore;
	}
	public String getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	public String getImdbVotes() {
		return imdbVotes;
	}
	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}
	public String getImdbID() {
		return imdbID;
	}
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
	}

}
