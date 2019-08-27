package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	@Qualifier("inventory")
	private JdbcTemplate  inventoryJdbcTemplate;
	
	@Autowired
	@Qualifier("order")
	private JdbcTemplate  orderJdbcTemplate ;
	
	@Transactional
	public int pay() {
		
		orderJdbcTemplate.execute("update `demo`.`order` set status =2 where id = 2");
		inventoryJdbcTemplate.execute("update `demo`.`inventory` set quantity =1 where id = 1");
		
		int a=10/0;
		
		return 0;
		
	}
}
