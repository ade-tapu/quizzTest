package com.sda.quizztest.Service;

import com.sda.quizztest.DTO.QuizzDto;
import com.sda.quizztest.DTO.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAll();

    UserDto getById (long id);

    Long add(UserDto user);

    Long delete (UserDto user);

    Long update (UserDto user);
}
