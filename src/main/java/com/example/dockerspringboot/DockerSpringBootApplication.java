package com.example.dockerspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DockerSpringBootApplication {
    @GetMapping("/")
    public String Index(final Model model){
        model.addAttribute("title", "Docker + springboot");
        model.addAttribute("msg", "welcome to docker container");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringBootApplication.class, args);
    }

}
