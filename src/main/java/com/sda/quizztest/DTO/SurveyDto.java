package com.sda.quizztest.DTO;

import com.sda.quizztest.Model.Quizz.QuestionModel;
import java.util.Date;
import java.util.List;

public class SurveyDto {
    private long id;
    private String description;
    private String title;
    private Date created;
    private List<QuestionDto> questionDtoList;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public List<QuestionDto> getQuestionDtoList() {
        return questionDtoList;
    }

    public void setQuestionDtoList(List<QuestionDto> questionDtoList) {
        this.questionDtoList = questionDtoList;
    }
}

