package com.excelsoft.hotelmanagement.service;

import java.util.List;
import com.excelsoft.hotelmanagement.entity.User;

public interface UserService {
	List<User> getUsers();

	User createUser(User user);

//	User getUserById(long id);
//	
//	User findBypassword(String password); 
//
//	boolean authenticateByUserName(String userName);
//
//	User checkUserNameAndPasswordExistOrNot(String userName,String password);
//	
//	Integer updatePassword(String userName,String password);
}
