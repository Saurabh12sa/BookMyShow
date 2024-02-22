package in.saurabhit.service;

import in.saurabhit.payload.request.FoodDtoRequest;
import in.saurabhit.payload.response.FoodDtoResponse;

public interface FoodService {

    FoodDtoResponse addNewFood(FoodDtoRequest foodDtoRequest);
}
