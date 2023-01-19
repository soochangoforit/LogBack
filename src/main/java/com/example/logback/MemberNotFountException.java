package com.example.logback;

import lombok.Getter;

/**
 * Member 를 찾지 못 했을때
 */
@Getter
public class MemberNotFountException extends BusinessException{

    public MemberNotFountException (ErrorCode code) {
        super(code);
    }

}
