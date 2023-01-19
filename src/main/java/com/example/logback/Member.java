package com.example.logback;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Member {

    @NotBlank(message = "이름을 입력해주세요.")
    private String name;

    @Max(value = 100, message = "나이는 100세 이하로 입력해주세요.")
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }



}
