package in.saurabhit.controller;

import in.saurabhit.payload.request.CinemaHallDtoRequest;
import in.saurabhit.payload.response.CinemaHallDtoResponse;
import in.saurabhit.service.CinemaHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController

public class CinemaHallController {


    @Autowired
    private CinemaHallService cinemaHallService;

    @PostMapping("/add_cinemaHall")
    public ResponseEntity<CinemaHallDtoResponse> addNewCinemaHall(@RequestBody CinemaHallDtoRequest cinemaHallDtoRequest)
    {
        CinemaHallDtoResponse cinemaHallDtoResponse = this.cinemaHallService.addCinemaHall(cinemaHallDtoRequest);

        return new ResponseEntity<>(cinemaHallDtoResponse, HttpStatus.CREATED);
    }

    @GetMapping("/cinemaHall")
    public ResponseEntity<List<CinemaHallDtoResponse>> getCinemaHallDetails()
    {
        List<CinemaHallDtoResponse> cinemaHallDetails = this.cinemaHallService.getCinemaHallDetails();

        return new ResponseEntity<>(cinemaHallDetails, HttpStatus.OK);

    }


}
