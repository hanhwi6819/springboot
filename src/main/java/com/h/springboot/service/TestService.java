package com.h.springboot.service;

import com.h.springboot.entity.User;
import com.h.springboot.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TestService {

    private final UserRepository userRepository;

    public List<User> getUserList()

    { //원래는 타입이 List type이어야 한다.

        return userRepository.findAll();
    }

    public Optional<User> getUser(Long userId) {
        return userRepository.findById(userId);
    }

}
