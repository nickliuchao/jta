package com.example.demo.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.OrderService;

@RestController
public class DemoController {
	@Autowired
	private OrderService orderService;
	@RequestMapping("/pay")
	public String pay() throws InterruptedException, ExecutionException {
		orderService.pay();
		return "";
	}
	

}
