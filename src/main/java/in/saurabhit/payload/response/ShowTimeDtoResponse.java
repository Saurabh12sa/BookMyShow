package in.saurabhit.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor

public class ShowTimeDtoResponse {


       private Integer showTimeId;

         private String   movieId;

        private String   hallId;

       private LocalDateTime startTime;


      private LocalDateTime endTime;


        private Integer availableSeats;
}
