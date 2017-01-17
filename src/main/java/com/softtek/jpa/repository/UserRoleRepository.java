package com.softtek.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softtek.jpa.domain.UserRole;


@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long>{
	


}
