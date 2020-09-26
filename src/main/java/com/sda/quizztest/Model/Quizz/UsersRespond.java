package com.sda.quizztest.Model.Quizz;



import com.sda.quizztest.Model.Login.UserModel;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "users_respond")
public class UsersRespond {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   @OneToOne
   private UserModel userModel;

   @OneToOne
   private QuestionModel questionModel;

   @OneToOne
   private AnswerModel answerModel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public QuestionModel getQuestionModel() {
        return questionModel;
    }

    public void setQuestionModel(QuestionModel questionModel) {
        this.questionModel = questionModel;
    }

    public AnswerModel getAnswerModel() {
        return answerModel;
    }

    public void setAnswerModel(AnswerModel answerModel) {
        this.answerModel = answerModel;
    }
}
