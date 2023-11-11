package com.mrsantos.holybibleacf.app.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mrsantos.holybibleacf.app.models.AboutModel;
import com.mrsantos.holybibleacf.app.repositories.AboutRepository;

@Service
public class AboutService {
    private final AboutRepository aboutRepository;

    public AboutService(AboutRepository aboutRepository){
        this.aboutRepository = aboutRepository;
    }

    public Optional<AboutModel> listAbout(){
        return aboutRepository.findFirstByOrderByIdAsc();
    }
}
