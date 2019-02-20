package com.bnsfl.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @PostMapping(path = "/message/")
    public MessageResponse message(@RequestBody MessageRequest request) {
        StringBuilder message = new StringBuilder(request.getName());
        message.append(", ");
        if (request.getSomeNumber() % 2 == 0) {
            message.append("eventually you'll get it right.");
        } else {
            message.append("what an odd request.");
        }

        return new MessageResponse(message.toString());
    }

}
