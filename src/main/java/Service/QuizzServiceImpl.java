package Service;

import com.sda.quizztest.DTO.QuestionDto;
import com.sda.quizztest.DTO.QuizzDto;
import com.sda.quizztest.DTO.UserDto;
import com.sda.quizztest.Model.Login.UserModel;
import com.sda.quizztest.Model.Quizz.QuestionModel;
import com.sda.quizztest.Model.Quizz.QuizzModel;
import com.sda.quizztest.Repository.QuizzRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class QuizzServiceImpl implements QuizzService {
    @Autowired
    QuizzRepository quizzRepository;

    @Override
    public List<QuizzDto> getAll() {
        List<QuizzModel> quizzModelList = quizzRepository.findAll();
        List<QuizzDto> quizzDtoList = new ArrayList<>();

        for (QuizzModel quizz : quizzModelList) {
            QuizzDto quizzDto = new QuizzDto();
            quizzDto.setDescription(quizz.getDescription());
            quizzDto.setQuizz_title(quizz.getQuizz_title());
            quizzDto.setUserDto(quizzDto.getUserDto());

            UserDto userDto = new UserDto();
            userDto.setName(userDto.getName());
            userDto.setEmail(userDto.getEmail());
            userDto.setPassword(userDto.getEmail());
            quizzDto.setUserDto(userDto);

            List<QuestionModel> questionModelList = quizz.getQuestionModelList();
            List<QuestionDto> questionDtoList = new ArrayList<>();
            for (QuestionModel question : questionModelList) {
                QuestionDto questionDto = new QuestionDto();
                questionDto.setTitle(question.getTitle());
                questionDtoList.add(questionDto);
            }
            quizzDtoList.add(quizzDto);

        }
        return quizzDtoList;
    }


    @Override
    public QuizzDto getById(long id) {
        return null;
    }

    @Override
    public Long add(QuizzDto quizz) {
        return null;
    }

    @Override
    public Long delete(QuizzDto quizz) {
        return null;
    }

    @Override
    public Long update(QuizzDto quizz) {
        return null;
    }
}
