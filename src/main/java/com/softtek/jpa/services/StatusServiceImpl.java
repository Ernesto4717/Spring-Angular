package com.softtek.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.jpa.domain.Status;
import com.softtek.jpa.repository.StatusRepository;

@Service
public class StatusServiceImpl implements StatusService{
	
	@Autowired
	StatusRepository statusRepository;

	@Override
	public List<Status> statusList(String type) {
		// TODO Auto-generated method stub
		return statusRepository.statusList(type);
	}



}
