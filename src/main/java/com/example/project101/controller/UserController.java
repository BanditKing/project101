package com.example.project101.controller;

import com.example.project101.dto.MemberDTO;
import com.example.project101.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class UserController {
    //생성자 주입
    private final MemberService memberService;

    // 회원가입 페이지 출력 요청
    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute MemberDTO memberDTO){
        System.out.println("UserController.register");
        System.out.println("memberDTO = " + memberDTO);
        memberService.register(memberDTO);



        return "home";
    }
}
