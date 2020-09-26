package com.sda.quizztest.Repository;

import com.sda.quizztest.Model.Quizz.SurveyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<SurveyModel,Long> {
}
