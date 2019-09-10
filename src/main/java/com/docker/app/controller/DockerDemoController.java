package com.docker.app.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DockerDemoController {

	Logger logger = LoggerFactory.getLogger(DockerDemoController.class);

	private static AtomicInteger i = new AtomicInteger();

	@GetMapping("/message")
	public String getMessage() {
		logger.debug("This is message : " + i.addAndGet(1));
		System.out.println("This is message : " + i.addAndGet(1));
		return "This is a Docker Demo App !!";
	}

}
