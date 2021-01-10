package com.h.springboot.service;

import com.h.springboot.dto.ApiDto;
import com.h.springboot.entity.Teacher;
import com.h.springboot.entity.User;
import com.h.springboot.repository.TeacherRepository;
import com.h.springboot.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ApiService {

    private final UserRepository userRepository;
    private final TeacherRepository teacherRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public Optional<User> getUser(Long userId) {
        return userRepository.findById(userId);
    }

    public String registUser(User user) {
        userRepository.save(user);

        if(user.getIdx() != null) {
            return "등록에 성공했습니다.";
        } else {
            return "등록에 실패했습니다.";
        }
    }
    public List<Teacher> getTeacherList() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacher(Long userId) {
        return teacherRepository.findById(userId);
    }
    public String registTeacher(Teacher teacher) {
        teacherRepository.save(teacher);

        if(teacher.getIdx() != null) {
            return "등록에 성공했습니다.";
        } else {
            return "등록에 실패했습니다.";
        }
    }
}
