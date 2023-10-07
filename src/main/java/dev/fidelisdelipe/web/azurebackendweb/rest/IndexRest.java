package dev.fidelisdelipe.web.azurebackendweb.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("api/index")
@RestController
public class IndexRest {
    @GetMapping("/hello")
    public String index() {
        return "Hello World Azure!";
    }
}
