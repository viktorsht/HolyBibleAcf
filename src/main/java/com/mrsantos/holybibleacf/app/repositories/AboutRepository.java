package com.mrsantos.holybibleacf.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrsantos.holybibleacf.app.models.AboutModel;

public interface AboutRepository extends JpaRepository<AboutModel,Integer>{
    Optional<AboutModel> findFirstByOrderByIdAsc();
}
