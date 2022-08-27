package com.pentalog.pentastagiu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
// Now these annotations are optional, but better have a configuration than sorry
//@EnableJpaRepositories(basePackageClasses = HibernateMovieRepository.class)
//@EntityScan(basePackages = "com.pentalog.pentastagiu.repository.model")
public class MoviesServiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MoviesServiceApplication.class, args);

        System.out.println(context);
        System.out.println("Hello World");
    }

}
