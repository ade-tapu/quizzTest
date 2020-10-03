package com.sda.quizztest.Service;

import com.sda.quizztest.DTO.QuestionDto;
import com.sda.quizztest.DTO.QuizzDto;

import java.util.List;

public interface QuestionService {
    List<QuestionDto> getAll();

    QuestionDto getById (long id);

    Long add(QuestionDto question);

    Long delete (QuestionDto question);

    Long update (QuestionDto question);
}

