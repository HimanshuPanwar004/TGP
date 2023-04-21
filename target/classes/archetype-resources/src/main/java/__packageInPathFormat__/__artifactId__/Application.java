package ${package}.${artifactId};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.camunda.zeebe.spring.client.EnableZeebeClient;

@EnableZeebeClient
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        final SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.run(args);
    }
}
