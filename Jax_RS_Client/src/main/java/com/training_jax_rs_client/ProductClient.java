package com.training_jax_rs_client;
import com.example.entity.Product;

import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ProductClient {

	public static void main(String[] args) {
		Client client =  ClientBuilder.newClient();
		WebTarget target = client.target("https://localhost:4040/products");
		Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
		Response resp = builder.get();
		String object = resp.readEntity(String.class);
		System.out.println();
//		Product object1 = resp.readEntity(Product.class);
//		
//    	System.out.println(object1);
//   	    Product toAdd = new Product(91,"hhu",500);
//    	Response response=builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
//    	System.out.println(response.getStatus());
//    	System.out.println(response.readEntity(String.class));
       }
	}

