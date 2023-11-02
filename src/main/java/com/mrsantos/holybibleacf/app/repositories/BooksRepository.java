package com.mrsantos.holybibleacf.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrsantos.holybibleacf.app.models.BooksModel;


public interface BooksRepository extends JpaRepository<BooksModel, Integer>{
    BooksModel findById(int book);
}
