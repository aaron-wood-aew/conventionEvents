package com.bah.t5.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.bah.t5.domain.CustomerFactory;
import com.bah.t5.domain.Token;
import com.bah.t5.repository.CustomersRepository;
import com.bah.t5.domain.Customer;

@RestController
@RequestMapping("/register")
public class RegisterAPI {
	@Autowired
	CustomersRepository repo;

	//  Workshop:  Implement logic to register a customer.  You could talk to the CustomersRepository object 
	//  directly; a more decoupled solution would be to use the customer API itself to manipulate Customer.
	//  Work out how to do this and build your own implementation,, look at RegisterAPISample.java 

	@PostMapping
	public ResponseEntity<?> registerCustomer(@RequestBody Customer newCustomer, UriComponentsBuilder uri) {
		//  Implementation here!
		return null;
	}


}
