package com.kodnest1.Spring_Boot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {
	@GetMapping(value="/gr")
	public String greet() {
		return "greet";
	}

}
