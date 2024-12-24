package com.example.pastebin.repository;

import com.example.pastebin.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<PostEntity,Long> {

    public PostEntity getPostEntityById(Long id);
}
