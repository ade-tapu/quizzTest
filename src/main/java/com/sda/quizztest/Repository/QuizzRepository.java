package com.sda.quizztest.Repository;

import com.sda.quizztest.Model.Quizz.QuizzModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizzRepository extends JpaRepository<QuizzModel,Long> {
}
