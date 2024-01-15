package com.board.jooboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.jooboard.dao.TestDAO;
import com.board.jooboard.dto.TestDTO;

@RestController
@RequestMapping("/api")
public class DBConnectTestCtrl {
	 	@Autowired
	    private TestDAO testDAO;

	    @GetMapping("/hello")
	    public List<TestDTO> HelloWorld() {
	        return testDAO.getTestData();
	    }
}
