package com.example.demo11.member;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Member {
    @JsonIgnore
    private Long memberSeq;
    private String name;
    @JsonProperty(required = true)
    private String email;

    @Builder
    public Member(String name, String email){
        this.name = name;
        this.email=email;
    }

}
