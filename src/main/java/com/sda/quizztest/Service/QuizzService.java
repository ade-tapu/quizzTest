package com.sda.quizztest.Service;

import com.sda.quizztest.DTO.QuizzDto;

import java.util.List;

public interface QuizzService {
    List<QuizzDto> getAll();

    QuizzDto getById (long id);

    Long add(QuizzDto quizz);

    Long delete (QuizzDto quizz);

    Long update (QuizzDto quizz);
}

