package com.sda.quizztest.Model.Quizz;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "quizz_model")
public class QuizzModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "survey_title")
    private String survey_title;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "quizz")
    private List<QuestionModel> questionModelList;

    private  List<AnswerModel> answerModelList;


}
