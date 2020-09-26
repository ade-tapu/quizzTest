package com.sda.quizztest.Repository;

import com.sda.quizztest.Model.Quizz.AnswerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<AnswerModel,Long> {
}
