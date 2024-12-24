package com.example.urlshortener.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "URL_TABLE")
public class URLEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ACTUAL_URL")
    private String actualUrl;

    @Column(name = "SHORT_URL")
    private String shortUrl;

    @CreatedDate
    @Column(name = "CREATION_DATE")
    private LocalDate createdDate;

    @Column(name = "EXPIRY_DATE")
    private LocalDateTime expiryDate;

//    private Long userId;

}
