package com.blueyonder.team4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.team4.model.Review;
import com.blueyonder.team4.repository.ReviewRepository;

@Service
public class ReviewService {

	
	@Autowired 
	ReviewRepository reviewrepository;
	public List<Review> reviews() {
	        
		return reviewrepository.findAll();
	}

}
