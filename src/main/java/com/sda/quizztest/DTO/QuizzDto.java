package com.sda.quizztest.DTO;

import com.sda.quizztest.Model.Quizz.QuestionModel;

import javax.persistence.*;
import java.util.List;

public class QuizzDto {
    private long id;
    private String quizz_title;
    private String description;
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
