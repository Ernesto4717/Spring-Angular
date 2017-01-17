package com.softtek.jpa.services;

import java.util.List;

import com.softtek.jpa.domain.Status;

public interface StatusService {
	
	List<Status> statusList(String type);

}
