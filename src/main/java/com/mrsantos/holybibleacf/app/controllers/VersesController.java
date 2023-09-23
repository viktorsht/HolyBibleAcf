package com.mrsantos.holybibleacf.app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrsantos.holybibleacf.app.models.VersesModel;
import com.mrsantos.holybibleacf.app.service.VersesService;

@RestController
@RequestMapping("/verses")
public class VersesController {

    private final VersesService versesService;

    public VersesController(VersesService versesService) {
        this.versesService = versesService;
    }

    @GetMapping("/{book}/{chapter}")
    public List<VersesModel> getVersesByBookAndChapter(@PathVariable int book, @PathVariable int chapter) {
        return versesService.findByAbbreviationAndChapter(book, chapter);
    }
}

