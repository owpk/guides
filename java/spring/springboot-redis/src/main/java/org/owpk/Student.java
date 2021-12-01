package org.owpk;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student implements Serializable {
  
    public enum Gender { 
        MALE, FEMALE
    }

    @Id
    private String id;
    private String name;
    private Gender gender;
    private int grade;

    public Student(String name, Gender gender, int grade) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }
}