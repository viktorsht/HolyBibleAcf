package com.mrsantos.holybibleacf.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrsantos.holybibleacf.app.models.VersesModel;

public interface VersesRepository extends JpaRepository<VersesModel, Integer> {
    List<VersesModel> findByBookAndChapter(int book, int chapter);
}

