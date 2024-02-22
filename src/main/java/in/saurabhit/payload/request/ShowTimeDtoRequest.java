package in.saurabhit.payload.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor

public class ShowTimeDtoRequest {


    @NotEmpty
    private LocalDateTime startTime;

    @NotEmpty
    private LocalDateTime endTime;

    @NotEmpty
    private Integer availableSeats;
}
