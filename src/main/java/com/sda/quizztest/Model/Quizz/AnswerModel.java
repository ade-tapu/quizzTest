package com.sda.quizztest.Model.Quizz;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "answer")
public class AnswerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "answer_description")
    private String answerDescription;

    @Column(name = "is_correct_answer")
    private Boolean isCorrectAnswer;

    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @Column(name = "date_modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;

    @ManyToOne
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
