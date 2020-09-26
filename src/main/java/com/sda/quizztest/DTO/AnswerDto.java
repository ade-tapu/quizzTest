package com.sda.quizztest.DTO;

import com.sda.quizztest.Model.Quizz.QuestionModel;

import javax.persistence.*;
import java.util.Date;

public class AnswerDto {
    private long id;
    private String answerDescription;
    private Boolean isCorrectAnswer;
    private Date created;
    private Date modified;
    private QuestionModel question;

    public QuestionModel getQuestion() {
        return question;
    }

    public void setQuestion(QuestionModel question) {
        this.question = question;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnswerDescription() {
        return answerDescription;
    }

    public void setAnswerDescription(String answerDescription) {
        this.answerDescription = answerDescription;
    }

    public Boolean getCorrectAnswer() {
        return isCorrectAnswer;
    }

    public void setCorrectAnswer(Boolean correctAnswer) {
        isCorrectAnswer = correctAnswer;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}

