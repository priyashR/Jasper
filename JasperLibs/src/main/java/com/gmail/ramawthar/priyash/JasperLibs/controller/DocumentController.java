package com.gmail.ramawthar.priyash.JasperLibs.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.ramawthar.priyash.JasperLibs.services.CreateDocumentService;

@RestController
public class DocumentController {

	@Autowired
	CreateDocumentService createDocumentService;
	
	
	  @RequestMapping(value = "/createDocument", method = RequestMethod.GET)
	  public ResponseEntity<Object> createDocument() {
		  createDocumentService.createSampleDoc();
		  return new ResponseEntity<>("Done!", HttpStatus.OK);
	  } 

}
