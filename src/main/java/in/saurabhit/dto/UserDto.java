package in.saurabhit.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class UserDto {

    private Integer id;

    @NotNull
    private String fname;

    @NotNull
    private String lname;

    @NotNull
    private String dob;

    @Email(message = "Email address is not valid")
    private String email;

    @NotNull
    private String password;


}
