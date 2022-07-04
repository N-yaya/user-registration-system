package com.wys.user.registration.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class userConfig {
    @Bean
    CommandLineRunner commandLineRunner(userRepository repository) {
        return args ->{
            userRegis ali = new userRegis(
                    "ali",
                     2L,
                    "ali@yahoo.fr",
                    "ndjm"

            );
            userRegis nassour = new userRegis(
                    "nassour",
                    1L,
                    "yaya.hachim@yahoo.fr",
                    "ndjm"

            );
            repository.saveAll(
                    List.of(ali, nassour)
            );
        };

    }
}
