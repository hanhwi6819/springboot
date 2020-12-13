package com.h.springboot.controller;

import com.h.springboot.entity.User;
import com.h.springboot.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor // 여기서는 없어도 된다.
public class TestController {

    private TestService testService;

    @GetMapping(value = "/api/test")
    public String helloWorld() {
        return "HelloWorld";
    }

    @GetMapping(value = "/api/user")
    public List<User> getUserList() { // 원래는 List 타입이다.
        return testService.getUserList();
    }

    @GetMapping(value = "/api/user/{userId}")
    public Optional<User> getUser(@PathVariable Long userId) {
        return testService.getUser(userId);
    }


}
