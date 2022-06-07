package com.Fackboos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Fackboos.config.ResourceBean;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	ResourceBean resBean;
	
	@RequestMapping("/test")
	public String test(){
		return resBean.getName();
	}
}
