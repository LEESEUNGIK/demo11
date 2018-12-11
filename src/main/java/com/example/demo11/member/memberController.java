package com.example.demo11.member;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(common.MEMBER_RESOURCE)
public class memberController {
    @GetMapping
    public Member getMember(){
        log.info("dddd");
        return Member.builder()
                    .name("lsi")
                    .email("lsi4761")
                    .build();
    }

    @PostMapping("/all")
    public List<Member> getMembers(){
        return Arrays.asList(Member.builder().name("lsi").email("lsi4761d").build(),
                   Member.builder().name("lsiddd").email("lsi4761dd").build());
    }

    @GetMapping("/info")
    public Member memberInfo(@RequestParam(name="no")Long no){
        return Member.builder()
                .name(no+"")
                .email("snb4301@gamil.com")
                .build();
    }

    @GetMapping("/info/{no}")
    public Member memberInfoPath(@PathVariable(name="no")Long no){
        return Member.builder()
                .email("snb4301@gamil.com")
                .name(no+"")
                .build();
    }

    @PostMapping("/info")
    public Member postMember(@RequestBody Member member){
        return member;
    }
}
