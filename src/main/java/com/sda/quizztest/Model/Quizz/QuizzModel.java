package com.sda.quizztest.Model.Quizz;

import com.sda.quizztest.Model.Login.UserModel;

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

    @OneToOne
    @JoinColumn(name = "quizz_id")
    private UserModel userModel;

    public String getQuizz_title() {
        return quizz_title;
    }

    public void setQuizz_title(String quizz_title) {
        this.quizz_title = quizz_title;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

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

    public List<QuestionModel> getQuestionModelList() {
        return questionModelList;
    }

    public void setQuestionModelList(List<QuestionModel> questionModelList) {
        this.questionModelList = questionModelList;
    }

}
