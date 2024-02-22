package in.saurabhit.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDtoResponse {

    private Integer movieId;

    private String movieTitle;

    private Double ticketPrice;
}
