package com.example.productservicedb.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ExceptionDTO {
    private String message;
    private String resolution;
    //if in case we want to give a resolution to the client(solution).
}
