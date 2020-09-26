package com.sda.quizztest.DTO;

import com.sda.quizztest.Model.Quizz.AnswerModel;
import com.sda.quizztest.Model.Quizz.QuizzModel;
import com.sda.quizztest.Model.Quizz.SurveyModel;

import javax.persistence.*;
import java.util.List;

public class QuestionDto {
    private long id;
    private String title;
    private List<AnswerModel> answerModelList;
    private int points;
    private QuizzModel quizz;
    private SurveyModel survey;

    public void setSurvey(SurveyModel survey) {
        this.survey = survey;
    }

    public SurveyModel getSurvey() {
        return survey;
    }

    public QuizzModel getQuizz() {
        return quizz;
    }

    public void setQuizz(QuizzModel quizz) {
        this.quizz = quizz;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<AnswerModel> getAnswerModelList() {
        return answerModelList;
    }

    public void setAnswerModelList(List<AnswerModel> answerModelList) {
        this.answerModelList = answerModelList;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}


