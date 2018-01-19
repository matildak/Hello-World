package se.labs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class OurController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/ping")
    @ResponseBody
    String ping() {
        return "pong";
    }

    @RequestMapping("/yo/{name}")
    @ResponseBody
    String yo(@PathVariable String name) {
        return "YO " + name;
    }

    @RequestMapping("/yo/{name}/test")
    @ResponseBody
    String yoyo(@PathVariable String name) {
        return "YO " + name + " test";
    }

    @RequestMapping("/age/{age}/years")
    @ResponseBody
    String age(@PathVariable String age) {
        return "Age " + age + " years";
    }

    //test för stash
    //och testa branch
    //på branchen


    //i den nya branchen

    //efter inmerge


    public static void main(String[] args) throws Exception {
        SpringApplication.run(OurController.class, args);
    }
}
