package com.sda.quizztest.Service;

import com.sda.quizztest.DTO.AnswerDto;

import java.util.List;

public interface AnswerService {

    List<AnswerDto> getAll();

    AnswerDto getById (long id);

    Long add(AnswerDto answer);

    Long delete (AnswerDto answer);

    Long update (AnswerDto answer);
}
