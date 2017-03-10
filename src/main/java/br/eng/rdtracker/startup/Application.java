package br.eng.rdtracker.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

/**
 * Created by rafael-danieli on 06/03/2017.
 */
@SpringBootApplication
@ComponentScan({"br.eng.rdtracker.rest", "br.eng.rdtracker.services.*"})
@EntityScan("br.eng.rdtracker.domain")
@EnableJpaRepositories("br.eng.rdtracker.repositories")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
