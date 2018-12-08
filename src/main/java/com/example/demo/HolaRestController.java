package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("/api")
@ConfigurationProperties(prefix = "helloapp")

public class HolaRestController {
	@Getter
	@Setter
	private String saying;
	@RequestMapping(method = RequestMethod.GET, value = "/hola", produces = "text/plain")
	public String hola() throws UnknownHostException {
		String hostName = null;


		try {
			hostName = InetAddress.getLocalHost().getHostAddress();

		} catch (UnknownHostException e) {
			hostName = "unknown";
		}
		return saying + " " + hostName;
	}
}
