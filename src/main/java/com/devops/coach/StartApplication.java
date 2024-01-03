package com.Bharath.Kumar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Testing Git-Mvn-Docker-Helm-K8s with Jenkins pipeline..!!!! ");
        model.addAttribute("msg", "Hello All..I have deployed springboot application into EKS cluster using Helm + Jenkins Pipeline!!!!");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
