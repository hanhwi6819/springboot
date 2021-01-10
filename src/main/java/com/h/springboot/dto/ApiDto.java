package com.h.springboot.dto;

import com.h.springboot.entity.User;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ApiDto {
    private Long idx;
    private String name;
    private Long age;
    private String school;
    private Long weight;

    public User toEntity(){
        User user = User.builder()
                .idx(idx)
                .name(name)
                .age(age)
                .school(school)
                .weight(weight)
                .build();
        return user;
    }

    @Builder
    public ApiDto(Long idx, String name, Long age, String school, Long weight) {
        this.idx = idx;
        this.name = name;
        this.age = age;
        this.school = school;
        this.weight = weight;
    }
}

