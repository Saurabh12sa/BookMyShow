package in.saurabhit.service;

import in.saurabhit.dto.UserDto;

import java.util.List;

public interface UserService  {

      UserDto registerUser(UserDto userDto);

      List<UserDto> getAllUser(UserDto userDto);
}
