package com.sda.quizztest.Model.Quizz;

import com.sda.quizztest.DTO.SurveyDto;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "question")
public class QuestionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @OneToMany(mappedBy = "question")
    private List<AnswerModel> answerModelList;

    @Column(name = "points")
    private int points;

    @ManyToOne
    private QuizzModel quizz;

    @ManyToOne
    private SurveyModel survey;

    public QuestionModel(SurveyModel survey) {
        this.survey = survey;
    }

    //constructor
   // public QuestionModel() {

   // }

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
