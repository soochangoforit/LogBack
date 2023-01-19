package com.example.logback;

import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {


    /**
     * 메시지와 데이터가 함께 응답하는 상황
     */
    @GetMapping("/test")
    public ResponseEntity<DefaultResponse> test(@Valid @RequestBody Member member) {
        throw new MemberNotFountException(ErrorCode.MEMBER_NOT_FOUND);

    }

    /**
     * Member 안에 들어 있는, @Valid 동작 확인
     */
    @GetMapping("/test2")
    public ResponseEntity<DefaultResponse> test2() {
        Member member = new Member("이름",12);
        Member member2 = new Member("이름35",35);




        return new ResponseEntity<>(MessageResponse.of(HttpStatus.OK, "메시지만 반환"), HttpStatus.OK);
    }


}
