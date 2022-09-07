package com.spring.firstProject.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	@RequestMapping("hello")
	@ResponseBody
	public String hello()
	{
		return "Hello.. Welcome to first web page..";
	}
	
	@RequestMapping("hello-jsp")
	public String helloJSP()
	{
		return "sayHello";
	}
}
