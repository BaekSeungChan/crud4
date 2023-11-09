package com.qortmdcks.crud4.payload;

import lombok.Data;

@Data
public class TeacherDto {
    private long id;

    private String name;

    private String age;

    private String subject;
}
