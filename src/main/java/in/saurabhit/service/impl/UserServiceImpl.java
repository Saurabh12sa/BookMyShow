package in.saurabhit.service.impl;

import in.saurabhit.Repository.UserRepository;
import in.saurabhit.dto.UserDto;
import in.saurabhit.entity.User;
import in.saurabhit.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto registerUser(UserDto userDto) {
       User user = this.modelMapper.map(userDto, User.class);
       User savedUser = this.userRepository.save(user);
       return modelMapper.map(savedUser,UserDto.class);

    }

    @Override
    public List<UserDto> getAllUser(UserDto userDto) {
        List<User> userList =this.userRepository.findAll();

        return userList.stream().map(user-> modelMapper.map(user,UserDto.class)).toList();
    }
}
