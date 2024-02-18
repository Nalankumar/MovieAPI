package com.MovieShow.MovieApi.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.MovieShow.MovieApi.Review;

import org.bson.types.ObjectId;


@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId>{
    
}
