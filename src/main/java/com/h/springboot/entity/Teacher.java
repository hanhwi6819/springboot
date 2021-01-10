package com.h.springboot.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
@Getter
@Table
public class Teacher {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idx;

    @Column(length = 10, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private Long age;

    @Column(length = 100, nullable = false)
    private String subject;

    @Column(length = 100, nullable = false)
    private Long annual;


    @Builder
    public Teacher(Long idx, String name, Long age, String subject, Long annual) {
        this.idx = idx;
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.annual = annual;
    }
}

