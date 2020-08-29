package com.dilz.socialmedia.Social.Media.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dilz.socialmedia.Social.Media.models.MediaDetails;
import com.dilz.socialmedia.Social.Media.repository.MediaDetailsRepository;

@RestController
public class MediaController {
	
	@Autowired
	MediaDetailsRepository mediaDetailsRepository;

	@PostMapping("/")
	public String test(@RequestBody MediaDetails media) {
		mediaDetailsRepository.save(media);
		return media.getName();
	}
}
