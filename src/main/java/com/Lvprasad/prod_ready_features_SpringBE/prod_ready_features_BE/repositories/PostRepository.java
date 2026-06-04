package com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.repositories;

import com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository  extends JpaRepository<PostEntity, Long> {

}
