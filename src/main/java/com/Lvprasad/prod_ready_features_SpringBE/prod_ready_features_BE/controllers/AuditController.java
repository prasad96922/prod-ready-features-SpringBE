package com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.controllers;

import com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.entities.PostEntity;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.http.ResponseEntity;
import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/audit")
public class AuditController {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    // how auditing works : sometimes it uses based on requirement : the database overload with data
    @GetMapping(path = "/posts/{postId}")
    ResponseEntity<List<PostEntity>> getPostRevisions(@PathVariable Long postId) {

        // AuditReader Factory
        AuditReader reader = AuditReaderFactory.get(entityManagerFactory.createEntityManager());

        List<Number> revisions = reader.getRevisions(PostEntity.class, postId);
        return ResponseEntity.ok(revisions
                .stream()
                .map(revisionNumber -> reader.find(PostEntity.class, postId, revisionNumber))
                .collect(Collectors.toList()));
    }

}
