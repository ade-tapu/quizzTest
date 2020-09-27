package Service;

import com.sda.quizztest.DTO.QuestionDto;
import com.sda.quizztest.Model.Quizz.QuestionModel;
import com.sda.quizztest.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{

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

            questionDtoList.add(questionDto);
        }
        return questionDtoList;
    }

    @Override
    public QuestionDto getById(long id) {
        return null;
    }

    @Override
    public Long add(QuestionDto questionDto) {
        QuestionModel questionModel = new QuestionModel();

        questionModel.setTitle(questionDto.getTitle());
        questionModel.setPoints(questionDto.getPoints());


        return null;
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
