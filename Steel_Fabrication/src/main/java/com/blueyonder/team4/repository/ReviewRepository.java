package com.blueyonder.team4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueyonder.team4.model.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Integer> {

}
