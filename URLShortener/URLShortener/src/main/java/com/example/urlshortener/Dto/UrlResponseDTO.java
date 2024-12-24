package com.example.urlshortener.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class UrlResponseDTO {
    private String longURL;
    private String shortURL;
    private LocalDate expiryDate;
}
