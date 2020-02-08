package com.crawler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/webcrawler")
public class Controller {

    @GetMapping(path = "/helloResponse", produces = "application/json")
    public Response getHelloResponse() {
        return new Response("Sps", "32");
    }

    @GetMapping(path = "/helloString")
    public String getHelloString() {
        return "Hello World !";
    }
}
