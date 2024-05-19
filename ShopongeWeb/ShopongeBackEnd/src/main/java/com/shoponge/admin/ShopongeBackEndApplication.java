package com.shoponge.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EntityScan({"com.shoponge.common.entity"})
public class ShopongeBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopongeBackEndApplication.class, args);
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String passwordToEncode = "esemio123";

        String encodedPassword = passwordEncoder.encode(passwordToEncode);

        System.out.println("Contraseña esemio123 codificada es: " + encodedPassword);
	}

}
