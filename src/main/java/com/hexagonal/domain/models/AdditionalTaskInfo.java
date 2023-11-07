package com.hexagonal.domain.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AdditionalTaskInfo {

    private final Long userId;
    private final String userName;
    private final String userEmail;


}
