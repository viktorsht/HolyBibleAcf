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

    public BooksModel listById(int id){
        return booksRepository.findById(id+1); // os livros são listados de 0 a ... e os captulos são procurados por id (1, 2, ...) 
    }
}
