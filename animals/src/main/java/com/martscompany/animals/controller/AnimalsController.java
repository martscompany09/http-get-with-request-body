package com.martscompany.animals.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martscompany.animals.dto.Animals;

@RestController
@RequestMapping(path="/animals")
public class AnimalsController {

	@GetMapping("/whater")
	public ResponseEntity<Animals> animalsOfWhater(@RequestBody Animals val) {
		return new ResponseEntity<Animals>(val,HttpStatus.ACCEPTED);
	}
	
}
