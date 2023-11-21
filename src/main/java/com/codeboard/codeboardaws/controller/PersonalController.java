package com.codeboard.codeboardaws.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PersonalController {
	@RequestMapping("/getname")
	public String getName() {
		return "AWS";
	}
}
