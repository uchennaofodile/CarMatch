package org.uchennaofodile.CarMatch.service;

import java.util.List;

import org.uchennaofodile.CarMatch.dto.UserDto;
import org.uchennaofodile.CarMatch.model.User;

public interface UserService {
	void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
