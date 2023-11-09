package com.mrsantos.holybibleacf.app.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrsantos.holybibleacf.app.models.BooksModel;
import com.mrsantos.holybibleacf.app.models.ChaptersModel;
import com.mrsantos.holybibleacf.app.models.VersesModel;
import com.mrsantos.holybibleacf.app.service.BooksService;
import com.mrsantos.holybibleacf.app.service.VersesService;

@RestController
@RequestMapping("/verses")
public class VersesController {

    private final VersesService versesService;
    private final BooksService booksService;

    public VersesController(VersesService versesService, BooksService booksService) {
        this.versesService = versesService;
        this.booksService = booksService;
    }

    @GetMapping(value = "/{book}/{chapter}", produces = "application/json; charset=UTF-8")
    public ResponseEntity<ChaptersModel> getVersesByBookAndChapter(@PathVariable int book, @PathVariable int chapter) {
        BooksModel bookModel = booksService.listById(book);
        List<VersesModel> verses =  versesService.findByAbbreviationAndChapter(book, chapter);
        ChaptersModel chapters = new ChaptersModel(chapter, bookModel, verses);

        return new ResponseEntity<>(chapters, HttpStatus.OK);
    }
}