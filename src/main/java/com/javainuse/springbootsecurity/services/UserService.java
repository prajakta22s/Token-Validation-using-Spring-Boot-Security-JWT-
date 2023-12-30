package com.javainuse.springbootsecurity.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.javainuse.springbootsecurity.model.DAOUser;
import com.javainuse.springbootsecurity.model.UserDTO;

@Service
public class UserService {
	
	private Map<String,DAOUser> userDetails = new HashMap<String, DAOUser>();
	
	public DAOUser findByUsername(String username) {
		if(userDetails.containsKey(username)) {
			return userDetails.get(username);
		}
		return null;
	}
	
	public DAOUser addUser(DAOUser user) {
		userDetails.put(user.getUsername(),user);
		return userDetails.get(user.getUsername());
	}
}
