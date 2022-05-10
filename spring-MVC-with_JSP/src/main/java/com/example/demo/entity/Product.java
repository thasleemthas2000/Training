package com.example.demo.entity;

	import org.springframework.stereotype.Component;

import lombok.AccessLevel;
	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;
	import lombok.experimental.FieldDefaults;

	@Data
	@Component
	@AllArgsConstructor
	@NoArgsConstructor
	@FieldDefaults(level=AccessLevel.PRIVATE)
	public class Product {
	       int productId;
	       String productName;
	       double Price;
	}

