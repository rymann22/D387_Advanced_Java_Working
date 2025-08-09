package edu.wgu.d387_sample_code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		executorService.execute(() -> {
			Locale enLocale = new Locale("en", "US");
			ResourceBundle enBundle = ResourceBundle.getBundle("welcome", enLocale);
			System.out.println(enBundle.getString("welcome"));
		});

		executorService.execute(() -> {
			Locale frLocale = new Locale("fr", "CA");
			ResourceBundle frBundle = ResourceBundle.getBundle("welcome", frLocale);
			System.out.println(frBundle.getString("welcome"));
		});

		executorService.shutdown();
	}

}
