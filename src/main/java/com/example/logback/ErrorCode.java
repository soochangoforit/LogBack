package com.example.logback;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    // Common (공통적으로 사용)
    INVALID_INPUT_VALUE(HttpStatus.BAD_REQUEST, "C001", "값이 올바르지 않습니다."),
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "C002", "지원하지 않는 Http Method 입니다."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "C003", "서버 에러"),
    INVALID_TYPE_VALUE(HttpStatus.BAD_REQUEST, "C004", "입력 값의 타입이 올바르지 않습니다."),
    HANDLE_ACCESS_DENIED(HttpStatus.FORBIDDEN, "C005", "접근이 거부 되었습니다."),

    // Depend on Entity (도메인에 따라서 달라지는 경우)
    EMAIL_DUPLICATION(HttpStatus.BAD_REQUEST, "E001", "이메일 중복 입니다."),
    LOGIN_INPUT_INVALID(HttpStatus.BAD_REQUEST, "L002", "로그인 정보가 올바르지 않습니다."),

    MEMBER_NOT_FOUND(HttpStatus.BAD_REQUEST, "M003", "존재하지 않는 회원입니다.");

    private HttpStatus status;
    private String code;
    private String message;

    public int getStatus(){
        return this.status.value();
    }

    ErrorCode (HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

}
