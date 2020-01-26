package io.javabrains.RatingDataService.Resource;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.RatingDataService.Model.Rating;
import io.javabrains.RatingDataService.Model.UserRating;

@RestController
@RequestMapping("/ratingdata")
public class RatingResource {
	
	@RequestMapping("/{userId}")
	public Rating getRating(@PathVariable("userId") String userId ){
		return  new Rating("A010", 3);
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String id){
		List<Rating> ratingList = new ArrayList<>();
		ratingList.add(new Rating("12345", 4));
		ratingList.add(new Rating("125", 5));
		ratingList.add(new Rating("44345", 3));
		
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratingList);
		return userRating;
	}

}
