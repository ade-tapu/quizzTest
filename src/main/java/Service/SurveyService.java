package Service;

import com.sda.quizztest.DTO.QuestionDto;
import com.sda.quizztest.DTO.SurveyDto;

import java.util.List;

public interface SurveyService {
    List<SurveyDto> getAll();

    SurveyDto getById (long id);

    Long add(SurveyDto survey);

    Long delete (SurveyDto survey);

    Long update (SurveyDto survey);
   // update for git
}
