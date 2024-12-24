package com.example.urlshortener.Controller;

import com.example.urlshortener.Dto.UrlDTO;
import com.example.urlshortener.Dto.UrlResponseDTO;
import com.example.urlshortener.Services.UrlService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/url")
@RequiredArgsConstructor
public class URLController {
    private final UrlService urlService;

    @PostMapping
    public ResponseEntity<UrlResponseDTO> shortenLink(@RequestBody @Valid UrlDTO urlDTO){
        UrlResponseDTO urlResponseDTO = urlService.shortenLink(urlDTO);
        return ResponseEntity.ok(urlResponseDTO);
    }
}
