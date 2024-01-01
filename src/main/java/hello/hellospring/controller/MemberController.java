package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService; // 컨테이너에서 받아서 써야함.

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }


}
