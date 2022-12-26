package guru.springframework.jokesapp;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JokesAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(JokesAppApplication.class, args);

    }

}
