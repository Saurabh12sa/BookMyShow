package in.saurabhit.service.impl;

import in.saurabhit.Repository.FoodRepository;
import in.saurabhit.entity.Food;
import in.saurabhit.payload.request.FoodDtoRequest;
import in.saurabhit.payload.response.FoodDtoResponse;
import in.saurabhit.service.FoodService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private ModelMapper modelMapper;



    @Override
    public FoodDtoResponse addNewFood(FoodDtoRequest foodDtoRequest) {

        Food food = this.modelMapper.map(foodDtoRequest, Food.class);
        Food savedFood = this.foodRepository.save(food);

        return this.modelMapper.map(savedFood, FoodDtoResponse.class);
    }

    }

