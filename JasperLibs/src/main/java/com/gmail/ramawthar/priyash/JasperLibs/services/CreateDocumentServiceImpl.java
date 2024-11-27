package com.gmail.ramawthar.priyash.JasperLibs.services;

import org.springframework.stereotype.Service;


@Service
public class CreateDocumentServiceImpl implements CreateDocumentService {
	
	
	@Override
	public String createSampleDoc(){

		System.out.println("Start document generation.");
		return "Success!";
	}

}
