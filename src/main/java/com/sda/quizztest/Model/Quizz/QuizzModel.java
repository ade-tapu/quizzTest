package com.sda.quizztest.Model.Quizz;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "quizz_model")
public class QuizzModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "quizz_title")
    private String quizz_title;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "quizz")
    private List<QuestionModel> questionModelList;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurvey_title() {
        return quizz_title;
    }

    public void setSurvey_title(String survey_title) {
        this.quizz_title = survey_title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<QuestionModel> getQuestionModelList() {
        return questionModelList;
    }

    public void setQuestionModelList(List<QuestionModel> questionModelList) {
        this.questionModelList = questionModelList;
    }

}
