package com.jsp.medicworld.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jsp.medicworld.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>
{
	@Query(value="select email from user where email=?1",nativeQuery=true)
	public String getusermail(String email);
}
