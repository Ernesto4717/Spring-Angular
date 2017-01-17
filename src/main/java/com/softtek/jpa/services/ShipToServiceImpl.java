package com.softtek.jpa.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.jpa.domain.ShipTo;
import com.softtek.jpa.repository.ShipToRepository;

@Service
public class ShipToServiceImpl implements ShipToService {
	
@Autowired
ShipToRepository shipToRepository;
	
	@Override
	public List<ShipTo> shipToList() {
		// TODO Auto-generated method stub
		return shipToRepository.shipToList();
	}

}
