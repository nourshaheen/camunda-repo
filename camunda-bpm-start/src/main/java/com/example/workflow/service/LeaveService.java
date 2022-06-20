package com.example.workflow.service;

import org.springframework.stereotype.Service;

@Service
public class LeaveService {

	public void printLeaveName(String name) {
		System.out.println("Leave name is >> " + name);
	}

}
