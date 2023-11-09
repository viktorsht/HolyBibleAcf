package com.mrsantos.holybibleacf.app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrsantos.holybibleacf.app.models.BooksModel;
import com.mrsantos.holybibleacf.app.service.BooksService;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping(produces = "application/json; charset=UTF-8")
    public List<BooksModel> getAllBooks(){
        List<BooksModel> books = booksService.list();
        return books;
    }

    @GetMapping("/{id}")
    public BooksModel getBook(@PathVariable int id){
        return booksService.listById(id);
    }
    
}
