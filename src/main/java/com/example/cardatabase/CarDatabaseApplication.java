package com.example.cardatabase;

import com.example.cardatabase.domain.Car;
import com.example.cardatabase.domain.CarRepository;
import com.example.cardatabase.domain.Owner;
import com.example.cardatabase.domain.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CarDatabaseApplication {
	@Autowired
	private CarRepository res;

	@Autowired
	private OwnerRepository orepository;

	private static final Logger logger =
			LoggerFactory.getLogger(CarDatabaseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CarDatabaseApplication.class, args);
		logger.info("Hello Spring Boot");
	}


	@Bean
	CommandLineRunner runner() {
		return args -> {
			//Add owner objects and save to db
			Owner o1 = new Owner("Patrick", "Maier");
			Owner o2 = new Owner("Chris", "Coelman");
			orepository.save(o1);
			orepository.save(o2);

			res.save(new Car("Audi", "A5", "Red",
					"license-plate", 2017, 28000,o1));
			res.save(new Car("Nissan", "Leaf", "White",
					"SSJ-3002", 2014, 29000,o1));
			res.save(new Car("Toyota", "Prius", "Silver",
					"KKO-0212", 2018, 39000,o2));

		};
	}
}


