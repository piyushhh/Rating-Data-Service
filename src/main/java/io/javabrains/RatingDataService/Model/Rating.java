package io.javabrains.RatingDataService.Model;

public class Rating {
	private String MovieId;
	private int MovieRating;
	public String getMovieId() {
		return MovieId;
	}
	public void setMovieId(String movieId) {
		MovieId = movieId;
	}
	public int getMovieRating() {
		return MovieRating;
	}
	public void setMovieRating(int movieRating) {
		MovieRating = movieRating;
	}
	public Rating(String movieId, int movieRating) {
		super();
		MovieId = movieId;
		MovieRating = movieRating;
	}
	
	
	
	

}
