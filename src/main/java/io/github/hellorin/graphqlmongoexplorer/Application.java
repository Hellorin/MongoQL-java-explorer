package io.github.hellorin.graphqlmongoexplorer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SpringBootApplication
@RestController
public class Application {
    @GetMapping("/")
    @CrossOrigin
    public void homeRedirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("https://hellorin.github.io/MongoQL-kotlin-explorer/");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
