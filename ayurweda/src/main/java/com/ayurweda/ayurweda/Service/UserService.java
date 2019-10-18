package com.ayurweda.ayurweda.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayurweda.ayurweda.DAO.User;
import com.ayurweda.ayurweda.Repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;

	public User createUser(User user) {
		return userRepo.save(user);
	}
}
