package com.example.demo.services;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

	Logger log = Logger.getAnonymousLogger();
	
	public List<String> getAccounts(){
		log.info("GET Accounts Called");
		return Arrays.asList("Thas", "Nas", "Naz");
	}
}
