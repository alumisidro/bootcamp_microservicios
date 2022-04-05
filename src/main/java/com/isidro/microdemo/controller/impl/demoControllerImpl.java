package com.isidro.microdemo.controller.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isidro.microdemo.controller.demoController;

@RestController
public class demoControllerImpl implements demoController {

	@GetMapping("/demo/holamundo")
	public ResponseEntity<String> saludo() {
		
		return new ResponseEntity<>(HttpStatus.OK).ok("Cliente: ");
	}

}
