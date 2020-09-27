package com.sda.quizztest.Controller;

import Service.QuestionServiceImpl;
import com.sda.quizztest.DTO.QuestionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("https://localhost:4200")
public class QuestionController {

    @Autowired
    private QuestionServiceImpl questionService;

    @GetMapping("getQuestion")
    public ResponseEntity<List<QuestionDto>> getQuestions() {
        List<QuestionDto> questionDtoList = questionService.getAll();
        return new ResponseEntity(questionDtoList, HttpStatus.OK);
    }

    @PostMapping("addQuestion")
    public ResponseEntity addQuestion(@RequestBody QuestionDto questionDto){
        questionService.add(questionDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("getQuestion/{id}")
    public ResponseEntity<QuestionDto> getQuestion(@PathVariable("id")Long id){
        QuestionDto questionDto = questionService.getById(id);
        return new ResponseEntity(questionDto,HttpStatus.OK);

    }

}
