package springboot.registrationlogin.service;

import java.util.List;

import springboot.registrationlogin.dto.UserDto;
import springboot.registrationlogin.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}