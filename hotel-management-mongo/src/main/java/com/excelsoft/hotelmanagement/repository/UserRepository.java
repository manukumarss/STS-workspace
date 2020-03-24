package com.excelsoft.hotelmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.excelsoft.hotelmanagement.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

//	List<User> findAll();
//
//	Optional<User> findByUserName(String userName);
//	
//	User findBypassword(String password);
//
//	@Query(value = "SELECT * FROM USER_DETAILS WHERE EMAIL_ID = :emailId and password = :password", nativeQuery = true)
//	User checkUserNameAndPasswordExistOrNot(@Param("emailId") String emailId, @Param("password") String password);
//
//	@Modifying
//	@Transactional
//	@Query(value = "UPDATE USER_DETAILS SET password = :password WHERE EMAIL_ID = :emailId", nativeQuery = true)
//	Integer changePassword(@Param("emailId") String emailId, @Param("password") String password);

}
