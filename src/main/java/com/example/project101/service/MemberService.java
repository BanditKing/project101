package com.example.project101.service;


import com.example.project101.dto.MemberDTO;
import com.example.project101.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void register(MemberDTO memberDTO) {
    }
}
