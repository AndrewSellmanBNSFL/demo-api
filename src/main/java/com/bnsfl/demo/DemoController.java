package com.bnsfl.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @PostMapping(path = "/message/")
    public MessageResponse message(@RequestBody MessageRequest request) {
        String message = request.getName() + ", ";
        if (request.getSomeNumber() % 2 == 0) {
            message += "eventually you'll get it right.";
        } else {
            message += "what an odd request.";
        }

        return new MessageResponse(message);
    }

}
