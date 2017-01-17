package com.softtek.jpa.services;

import java.util.List;

import com.softtek.jpa.domain.UserRole;

public interface UserRolService {
	List<UserRole> userRoleList();
	List<String> statusList();
}
