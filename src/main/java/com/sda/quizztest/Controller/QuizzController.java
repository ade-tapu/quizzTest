package com.sda.quizztest.Controller;

import Service.QuizzServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class QuizzController {
    
    @Autowired
    private QuizzServiceImpl quizzService;
}
