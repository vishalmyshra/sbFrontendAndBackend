package com.random.dao;

import org.springframework.data.repository.CrudRepository;


import com.random.entity.UserLoginCredential;
import java.util.List;


public interface Crud extends CrudRepository<UserLoginCredential, Integer> {

	public UserLoginCredential findByEmail(String email);
}
