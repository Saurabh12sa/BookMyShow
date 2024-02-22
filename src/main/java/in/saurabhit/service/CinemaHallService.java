package in.saurabhit.service;

import in.saurabhit.payload.request.CinemaHallDtoRequest;
import in.saurabhit.payload.response.CinemaHallDtoResponse;

import java.util.List;

public interface CinemaHallService {

      CinemaHallDtoResponse addCinemaHall(CinemaHallDtoRequest cinemaHallDtoRequest);
        List<CinemaHallDtoResponse> getCinemaHallDetails();
}
