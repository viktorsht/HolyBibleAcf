package com.mrsantos.holybibleacf.app.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrsantos.holybibleacf.app.models.AboutModel;
import com.mrsantos.holybibleacf.app.service.AboutService;


@RestController
@RequestMapping("/about")
public class AboutController {
    private final AboutService aboutService;
    
    public AboutController(AboutService aboutService){
        this.aboutService = aboutService;
    }

    @GetMapping(/*produces = "application/json; charset=UTF-8"*/)
    public ResponseEntity<AboutModel> getAbout(){
        return aboutService.listAbout().map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
