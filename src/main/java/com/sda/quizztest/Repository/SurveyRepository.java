package com.sda.quizztest.Repository;

import com.sda.quizztest.Model.Quizz.SurveyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends JpaRepository<SurveyModel,Long> {
}
