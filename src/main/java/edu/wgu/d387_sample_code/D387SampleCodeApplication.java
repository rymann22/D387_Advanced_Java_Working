package edu.wgu.d387_sample_code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import edu.wgu.d387_sample_code.services.WelcomeMessage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		ExecutorService executor = Executors.newFixedThreadPool(2);

		executor.execute(() -> {
			String msg = WelcomeMessage.getWelcomeMessage(new Locale("en", "US"));
			System.out.println(msg);
		});

		executor.execute(() -> {
			String msg = WelcomeMessage.getWelcomeMessage(new Locale("fr", "CA"));
			System.out.println(msg);
		});

		executor.shutdown();
	}
}
