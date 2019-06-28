package com.springbootDocker.SpringbootJARDocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DockerResource {
	
	@GetMapping("/docker")
	public String hello() {
		return "You are using DOCKER now";
	}

}
