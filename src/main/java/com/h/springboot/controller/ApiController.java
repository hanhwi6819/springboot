package com.h.springboot.controller;

import com.h.springboot.dto.ApiDto;
import com.h.springboot.entity.Teacher;
import com.h.springboot.entity.User;
import com.h.springboot.service.ApiService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor // 여기서는 없어도 된다.
public class ApiController {
    private ApiService apiService;

    @GetMapping(value = "/api/test")
    public String helloWorld() {
        return "HelloWorld";
    }

    @GetMapping(value = "/api/user")
    public List<User> getUserList() { // 원래는 List 타입이다.
        return apiService.getUserList();
    }

    @GetMapping(value = "/api/user/{userId}")
    public Optional<User> getUser(@PathVariable Long userId) {
        return apiService.getUser(userId);
    }

    @GetMapping(value = "/api/teacher")
    public List<Teacher> getTeacherList() { // 원래는 List 타입이다.
        return apiService.getTeacherList();
    }

    @GetMapping(value = "/api/teacher/{userId}")
    public Optional<Teacher> getTeacher(@PathVariable Long userId) {
        return apiService.getTeacher(userId);
    }

    @PostMapping(value = "/api/user")
    public String registUser(@RequestBody User user) { //body는 노출 X,
        return apiService.registUser(user);

    }

    @PostMapping(value = "/api/teacher")
    public String registTeacher(@RequestBody Teacher teacher) { //body는 노출 X,
        return apiService.registTeacher(teacher);

    }

}
