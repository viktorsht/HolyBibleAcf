package com.mrsantos.holybibleacf.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mrsantos.holybibleacf.app.models.TestamentModel;
import com.mrsantos.holybibleacf.app.repositories.TestamentRepository;

@Service
public class TestamentService {
    
    private final TestamentRepository testamentRepository;
    
    public TestamentService(TestamentRepository testamentRepository){
        this.testamentRepository = testamentRepository;
    }
    
    public List<TestamentModel> list(){
        return testamentRepository.findAll();
    }
}
