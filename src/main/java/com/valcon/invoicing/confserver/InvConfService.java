package com.valcon.invoicing.confserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableConfigServer
public class InvConfService {

	final static Logger LOG = LoggerFactory.getLogger(InvConfService.class);

	@GetMapping("/")
	String home() {
		return "This is Valcon invoicing configuration service!";
	}

	public static void main(String[] args) {
		/* ConfigurableApplicationContext ctx = */
		SpringApplication.run(InvConfService.class, args);
		LOG.info("Inv. conf. server started.");
	}
}