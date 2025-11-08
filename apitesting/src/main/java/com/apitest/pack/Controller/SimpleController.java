package com.apitest.pack.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleController {

    // GET method
    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }

    // POST method
    @PostMapping("/message")
    public String postMessage(@RequestBody Message message) {
        return "Received message: " + message.getContent();
    }
}

// Message class (POJO)
class Message {
    private String content;

    // Getter and Setter
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
