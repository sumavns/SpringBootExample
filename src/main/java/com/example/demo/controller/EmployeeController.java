package com.example.demo.controller;

import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.Constants;
import com.example.demo.service.EmployeeService;

@RestController
@Validated
public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService empServiceImpl;

	@PostMapping(value = "/employees/{empid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void insertEmployeeDetails(
			@PathVariable("empid") @NotNull(message = Constants.EMPID_NULL_MESSAGE) final int empid) {
		logger.info("inside insertEmployeeDetails method with param {}", empid);
		empServiceImpl.insertEmployeeDetails(empid);
	}
}
