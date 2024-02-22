package in.saurabhit.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CinemaHallDtoResponse {

    private Integer hallId;

    private String hallName;

    private String location;

    private Integer seatingCapacity;

    private Integer screens;


}
