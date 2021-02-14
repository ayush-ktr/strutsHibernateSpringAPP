package com.highradius.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ratings")
public class Ratings {

	@Id
	@GenericGenerator(name="autoGen" ,strategy="increment")
    @GeneratedValue(generator="autoGen")
	@Column(name = "pk_id")
	private int pk_id;
	@Column(name = "is_active")
	private boolean isActive;
	@Column(name = "rating")
	private int rating;
	@ManyToOne(targetEntity = Movie.class)
    @JoinColumn(name="fk_movies_id")
	private int fkMoviesId;
	
	public int getPk_id() {
		return pk_id;
	}
	public void setPk_id(int pk_id) {
		this.pk_id = pk_id;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getFkMoviesId() {
		return fkMoviesId;
	}
	public void setFkMoviesId(int fkMoviesId) {
		this.fkMoviesId = fkMoviesId;
	}
}
