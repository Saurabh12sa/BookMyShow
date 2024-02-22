package in.saurabhit.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Access;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodDtoResponse {

    private Integer foodItemId;

    private String itemName;

    private Double price;

}
