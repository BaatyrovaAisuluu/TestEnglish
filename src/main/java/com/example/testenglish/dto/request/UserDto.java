package com.example.testenglish.dto.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto  {
    private  String name;
    private  String email;
    private  String password;
}
