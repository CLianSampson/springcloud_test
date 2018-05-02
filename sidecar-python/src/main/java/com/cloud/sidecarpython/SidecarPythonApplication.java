package com.cloud.sidecarpython;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableSidecar
@SpringBootApplication
public class SidecarPythonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SidecarPythonApplication.class, args);
	}
}
