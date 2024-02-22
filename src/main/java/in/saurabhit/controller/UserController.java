package in.saurabhit.controller;

import in.saurabhit.dto.UserDto;
import in.saurabhit.entity.User;
import in.saurabhit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto){

        UserDto userDto1 = userService.registerUser(userDto);

        return new ResponseEntity<>(userDto1, HttpStatus.ACCEPTED);

    }
    @GetMapping("/register/ {id}")
   public ResponseEntity<UserDto> getUser(@PathVariable Integer id){

        UserDto userDto = new UserDto();
        userDto.setFname("Rahul");
        userDto.setLname("Mangal");
        userDto.setDob("1998-08-12");
        userDto.setEmail("jony2663@gssh.com");
        userDto.setPassword("128383");
        return new ResponseEntity<>(userDto,HttpStatus.OK);
   }
}
