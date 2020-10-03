package Service;

import com.sda.quizztest.DTO.QuestionDto;
import com.sda.quizztest.DTO.QuizzDto;
import com.sda.quizztest.DTO.SurveyDto;
import com.sda.quizztest.Model.Quizz.QuestionModel;
import com.sda.quizztest.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public List<QuestionDto> getAll() {
        List<QuestionModel> questionModelList = questionRepository.findAll();
        List<QuestionDto> questionDtoList = new ArrayList<>();

        for (QuestionModel question : questionModelList) {
            QuestionDto questionDto = new QuestionDto();
            questionDto.setTitle(question.getTitle());
            questionDto.setPoints(question.getPoints());

//            SurveyDto surveyDto = new SurveyDto();
//            surveyDto.setDescription(surveyDto.getDescription());
//            surveyDto.setTitle(surveyDto.getTitle());
//            surveyDto.setCreated(surveyDto.getCreated());
//            questionDto.setSurvey(surveyDto);
//
//            QuizzDto quizzDto = new QuizzDto();
//            quizzDto.setDescription(quizzDto.getDescription());
//            quizzDto.setQuizz_title(quizzDto.getQuizz_title());
//            quizzDto.setQuestionDtoList(quizzDto.getQuestionDtoList());
//            quizzDto.setUserDto(quizzDto.getUserDto());

            questionDtoList.add(questionDto);
        }
        return questionDtoList;
    }

    @Override
    public QuestionDto getById(long id) {
        Optional <QuestionModel> questionModelOptional=questionRepository.findById(id);

        if(questionModelOptional.isPresent()){
        QuestionModel questionModel = questionModelOptional.get();

        QuestionDto questionDto = new QuestionDto();
        questionDto.setTitle(questionModel.getTitle());
        questionDto.setPoints(questionModel.getPoints());



        return questionDto;}

        return null;
    }

    @Override
    public Long add(QuestionDto questionDto) {
        QuestionModel questionModel = new QuestionModel();

        questionModel.setTitle(questionDto.getTitle());
        questionModel.setPoints(questionDto.getPoints());

        questionRepository.save(questionModel);
        return questionModel.getId();
    }

    @Override
    public Long delete(QuestionDto question) {
        return null;
    }

    @Override
    public Long update(QuestionDto question) {
        return null;
    }
}
