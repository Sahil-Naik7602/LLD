package com.example.urlshortener.Repositories;

import com.example.urlshortener.Entities.URLEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends JpaRepository<URLEntity,Long> {
}
