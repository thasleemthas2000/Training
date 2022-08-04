package com.example.demo.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Books;
import com.example.demo.entity.Cart;
import com.example.demo.entity.User;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
public class UserDTO {

	private Books book;
	private Cart cart;
	private User user;
}
//private List<TripDetail> trips;