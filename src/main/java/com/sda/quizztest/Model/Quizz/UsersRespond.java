package com.sda.quizztest.Model.Quizz;



import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "users_respond")
public class UsersRespond {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

   @OneToMany(mappedBy = "users_respond")
   @JoinTable(name = "user_question")
    private List<QuestionModel> questionModelList;
}
