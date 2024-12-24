package com.example.urlshortener.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class UrlDTO {
    private String longURL;
    private LocalDate expiryDate;
}
