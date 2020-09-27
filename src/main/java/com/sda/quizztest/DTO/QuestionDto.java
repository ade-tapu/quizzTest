package com.sda.quizztest.DTO;

import com.sda.quizztest.Model.Quizz.AnswerModel;
import com.sda.quizztest.Model.Quizz.QuizzModel;
import com.sda.quizztest.Model.Quizz.SurveyModel;

import javax.persistence.*;
import java.util.List;

public class QuestionDto {
    private long id;
    private String title;
    private List<AnswerDto> answerDtoList;
    private int points;
    private QuizzDto quizz;
    private SurveyDto survey;

    public SurveyDto getSurvey() {
        return survey;
    }

    public void setSurvey(SurveyDto survey) {
        this.survey = survey;
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

    public List<AnswerDto> getAnswerDtoList() {
        return answerDtoList;
    }

    public void setAnswerDtoList(List<AnswerDto> answerDtoList) {
        this.answerDtoList = answerDtoList;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public QuizzDto getQuizz() {
        return quizz;
    }

    public void setQuizz(QuizzDto quizz) {
        this.quizz = quizz;
    }

}


