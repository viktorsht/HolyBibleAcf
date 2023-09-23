package com.mrsantos.holybibleacf.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mrsantos.holybibleacf.app.models.BooksModel;
import com.mrsantos.holybibleacf.app.repositories.BooksRepository;

@Service
public class BooksService {
    private final BooksRepository booksRepository;

    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<BooksModel> list(){
        return booksRepository.findAll();
    }
}
