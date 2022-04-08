package com.kodigobank.kodigobank;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class KodigobankApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodigobankApplication.class, args);
	}

}
