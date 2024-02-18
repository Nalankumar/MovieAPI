package com.MovieShow.MovieApi.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;

import com.MovieShow.MovieApi.Movie;
import com.MovieShow.MovieApi.Review;
import com.MovieShow.MovieApi.Repository.ReviewRepository;

public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    private MongoTemplate mongoTemplate;

    public Review addReview(String body, String imdbid){
        Review review = reviewRepository.insert(new Review(body));
        mongoTemplate.update(Movie.class)
            .matching(Criteria.where("imdbid").is(imdbid))
            .apply(new Update().push("reviewIds").value(review))
            .first();
        return review;
        
    }
}
