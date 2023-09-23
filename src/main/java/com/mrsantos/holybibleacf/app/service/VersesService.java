package com.mrsantos.holybibleacf.app.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.mrsantos.holybibleacf.app.models.VersesModel;
import com.mrsantos.holybibleacf.app.repositories.VersesRepository;

@Service
public class VersesService {

    private final VersesRepository versesRepository;

    public VersesService(VersesRepository versesRepository) {
        this.versesRepository = versesRepository;
    }

    public List<VersesModel> findByAbbreviationAndChapter(int book, int chapter) {
        return versesRepository.findByBookAndChapter(book, chapter);
    }
}


