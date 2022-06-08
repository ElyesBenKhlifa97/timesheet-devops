package tn.esprit.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimesheetDevopsApplication {
	
	private static final Logger log = LogManager.getLogger(TimesheetDevopsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TimesheetDevopsApplication.class, args);
	}

}
