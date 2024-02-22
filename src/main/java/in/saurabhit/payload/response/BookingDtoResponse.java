package in.saurabhit.payload.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class BookingDtoResponse {

    private Integer bookingId;

    private String userId;

    private String movieId;

    private String hallId;

    private String showTimeId;


    private List<Integer> seat;

    private Double totalAmount;

    private String status;
}
