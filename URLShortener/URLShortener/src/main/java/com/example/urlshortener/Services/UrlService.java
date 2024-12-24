package com.example.urlshortener.Services;

import com.example.urlshortener.Dto.UrlDTO;
import com.example.urlshortener.Dto.UrlResponseDTO;
import com.example.urlshortener.Entities.URLEntity;
import com.example.urlshortener.Repositories.UrlRepository;
import com.example.urlshortener.Processor.UrlProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UrlService {
    private final UrlRepository urlRepository;
    private final UrlProcessor urlProcessor;


    public UrlResponseDTO shortenLink(UrlDTO urlDTO){
        String shortenURL = urlProcessor.shortenURL(urlDTO.getLongURL());
        UrlResponseDTO urlResponseDTO = new UrlResponseDTO();
        urlResponseDTO.setLongURL(urlDTO.getLongURL());
        urlResponseDTO.setExpiryDate(urlDTO.getExpiryDate());
        urlResponseDTO.setShortURL(shortenURL);

        URLEntity urlEntity = new URLEntity();
        urlEntity.setActualUrl(urlDTO.getLongURL());
        urlEntity.setShortUrl(shortenURL);
        urlRepository.save(urlEntity);

        return urlResponseDTO;
    }

}
