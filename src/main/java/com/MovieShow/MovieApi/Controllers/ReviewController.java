package com.MovieShow.MovieApi.Controllers;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.MovieShow.MovieApi.Review;
import com.MovieShow.MovieApi.Services.ReviewService;

@RestController
@RequestMapping("/api/v1/review")
public class ReviewController {
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> postReview(@RequestBody Map<String,String> payload){
        return new ResponseEntity<Review>(reviewService.addReview(payload.get("body"), payload.get("id")),HttpStatus.CREATED);
    } 

}
