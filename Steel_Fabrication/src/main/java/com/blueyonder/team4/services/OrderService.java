package com.blueyonder.team4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.team4.model.Order_Table;
import com.blueyonder.team4.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired 
	OrderRepository orderrepository;

	public Order_Table getorderbyid(Integer i) {
		// TODO Auto-generated method stub
		return orderrepository.findById(i).orElse(null);
	}

	
	
	}


