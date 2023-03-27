package demo.spring_boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {
	
	@Value("${environment}")
	private String environment;
	
    public static void main(String[] args) { 
        SpringApplication.run(App.class, args);
    }

    @RequestMapping(value = "/")
    String hello() {
        return String.format("Hello World! %s",environment);
    }
}