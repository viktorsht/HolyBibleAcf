package com.mrsantos.holybibleacf.app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrsantos.holybibleacf.app.models.TestamentModel;
import com.mrsantos.holybibleacf.app.service.TestamentService;

@RestController
@RequestMapping("/testaments")
public class TestamentController {

    private final TestamentService testamentService;
    
    public TestamentController(TestamentService testamentService){
        this.testamentService = testamentService;
    }

    @GetMapping
    List<TestamentModel> getAllTestaments() {
        List<TestamentModel> testaments = testamentService.list();
        return testaments;
    }
}
