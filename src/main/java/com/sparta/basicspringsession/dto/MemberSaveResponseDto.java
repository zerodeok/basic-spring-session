package com.sparta.basicspringsession.dto;

public class MemberSaveResponseDto {

    private final Long id;
    private final String name;


    public MemberSaveResponseDto(Long id ,String name) {
        this.id = id;
        this.name = name;
    }
}
