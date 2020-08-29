package com.dilz.socialmedia.Social.Media.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dilz.socialmedia.Social.Media.models.MediaDetails;

public interface MediaDetailsRepository extends MongoRepository<MediaDetails, String> {

}
