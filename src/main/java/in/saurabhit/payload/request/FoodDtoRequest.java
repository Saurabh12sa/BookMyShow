package in.saurabhit.payload.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodDtoRequest {

    private String itemName;

    private Double ticketPrice;
}
