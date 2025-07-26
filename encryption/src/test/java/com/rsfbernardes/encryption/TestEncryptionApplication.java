package com.rsfbernardes.encryption;

import org.springframework.boot.SpringApplication;

public class TestEncryptionApplication {

	public static void main(String[] args) {
		SpringApplication.from(EncryptionApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
