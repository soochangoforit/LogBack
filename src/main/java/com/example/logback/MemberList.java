package com.example.logback;

import java.util.List;
import lombok.Getter;

@Getter
public class MemberList {

    private List<Member> memberList;

    public MemberList(List<Member> memberList) {
        this.memberList = memberList;
    }
}
