package in.saurabhit.controller;

import in.saurabhit.payload.request.FoodDtoRequest;
import in.saurabhit.payload.response.FoodDtoResponse;
import in.saurabhit.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {


    @Autowired
    private FoodService foodService;


    @PostMapping("/food")
    public ResponseEntity<FoodDtoResponse> addFoodItem(@RequestBody FoodDtoRequest foodDtoRequest){


        FoodDtoResponse foodDtoResponse = this.foodService.addNewFood(foodDtoRequest);

        return new ResponseEntity<>(foodDtoResponse, HttpStatus.CREATED);
    }
}
