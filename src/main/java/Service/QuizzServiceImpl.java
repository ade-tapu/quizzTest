package Service;

import com.sda.quizztest.DTO.QuizzDto;
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
            quizzDto.setDescription(quizzDto.getDescription());
            quizzDto.setQuizz_title(quizzDto.getQuizz_title());
            quizzDto.setUserDto(quizzDto.getUserDto());


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
