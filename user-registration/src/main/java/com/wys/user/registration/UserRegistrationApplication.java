package com.wys.user.registration;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class UserRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationApplication.class, args);
	}

	@GetMapping
		public String hello() {
			//return List.of(new userRegis(
				//	1L,
				//	"nassour",
				//	12345L,
					//"yaya.hachim@yahoo.fr",
					//"am"));
		return "hello this main page";
	}
}
