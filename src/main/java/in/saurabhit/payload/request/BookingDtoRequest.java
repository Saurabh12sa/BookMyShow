package in.saurabhit.payload.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@NoArgsConstructor
public class BookingDtoRequest {

    @NotEmpty
    private List<Integer> seat;

}
