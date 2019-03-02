package com.sudhir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudhir.model.DataBase;

@RestController
public class DatabaseController {

	@Autowired
	private DataBase database;
	
	
	@GetMapping(path="/db")
	public DataBase getDatabaseDetails() {
		System.out.println("Dtabase username = "+database.getUserName());
		return new DataBase(database.getDriver(), database.getUrl(), database.getUserName(), database.getPassword());
	}
}
