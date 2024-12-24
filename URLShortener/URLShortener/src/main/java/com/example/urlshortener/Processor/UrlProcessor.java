package com.example.urlshortener.Processor;

import org.springframework.stereotype.Component;

@Component
public class UrlProcessor {
    private Long counter = 1000000L;

    public String shortenURL(String longURL){
        String tinyURL = "http://tinyURL.com/";
        String encodedString = base62Encode(counter);
        counter++;
        return tinyURL + encodedString;
    }

    public String base62Encode(Long counter){
        String allAlphabets = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String encodedString = "";
        Long temp = counter;
        while (temp>=62){
            encodedString = encodedString.concat(String.valueOf(allAlphabets.charAt((int) (temp%62))));
            temp = Math.floorDiv(temp,62);
        }
        return encodedString;
    }
}
