package com.sda.quizztest.Repository;

import com.sda.quizztest.Model.Quizz.QuestionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionModel,Long> {
}
