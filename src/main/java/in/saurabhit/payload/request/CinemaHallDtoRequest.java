package in.saurabhit.payload.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CinemaHallDtoRequest {


    private String hallName;


    private String location;


    private Integer seatingCapacity;


    private Integer screens;

}

