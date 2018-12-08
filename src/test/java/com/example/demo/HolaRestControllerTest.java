package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.net.UnknownHostException;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)


public class HolaRestControllerTest {
	@Autowired
	HolaRestController holaRestController;

	@Ignore
	@Test
	public void testHola() throws UnknownHostException {
		assertEquals("Guten Tag aus 192.168.2.102", holaRestController.hola());
	}

}
