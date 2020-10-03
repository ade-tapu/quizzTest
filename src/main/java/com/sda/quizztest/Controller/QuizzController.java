package com.sda.quizztest.Controller;

import com.sda.quizztest.Service.QuizzServiceImpl;
import com.sda.quizztest.DTO.QuizzDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class QuizzController {

    @Autowired
    private QuizzServiceImpl quizzService;

    @GetMapping("getQuizzes")
    public ResponseEntity<List<QuizzDto>> getQuizzes() {
        List<QuizzDto> quizzDtoList = quizzService.getAll();
        return new ResponseEntity(quizzDtoList, HttpStatus.OK);
    }

    @PostMapping("addQuizzes")
    public ResponseEntity addQuizz(@RequestBody QuizzDto quizzDto){
        quizzService.add(quizzDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("getQuizz/{id}")
    public ResponseEntity<QuizzDto> getQuizz(@PathVariable("id")Long id){
        QuizzDto quizzDto = quizzService.getById(id);
        return new ResponseEntity(quizzDto,HttpStatus.OK);

    }

    @PostMapping("addQuestiontoQuizz/{idQuizz}/{idQuestion}")
    public ResponseEntity addQuestionToQuizz(@PathVariable("idQuizz")Long idQuizz,@PathVariable("idQuestion")Long idQuestion){
       quizzService.addQuestionToQuizz(idQuizz,idQuestion);

        return new ResponseEntity(HttpStatus.OK);
    }
}
