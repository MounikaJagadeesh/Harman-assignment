package com.example.Marvel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
	@RequestMapping("/")
	public String test() 
	{
		return "Wonder woman";
	}
}
