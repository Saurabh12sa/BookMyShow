package in.saurabhit.payload.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDtoRequest {

    private String movieTitle;

    private Double ticketPrice;

}
