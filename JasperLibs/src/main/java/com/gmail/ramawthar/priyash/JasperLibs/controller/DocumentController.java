package com.gmail.ramawthar.priyash.JasperLibs.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {

	
	  @RequestMapping(value = "/createDocument", method = RequestMethod.GET)
	  public ResponseEntity<Object> createDocument() {
		  return new ResponseEntity<>("Done!", HttpStatus.OK);
	  } 

}
