package in.saurabhit.service.impl;

import in.saurabhit.Repository.CinemaHallRepository;
import in.saurabhit.entity.CinemaHall;
import in.saurabhit.payload.request.CinemaHallDtoRequest;
import in.saurabhit.payload.response.CinemaHallDtoResponse;
import in.saurabhit.payload.response.MovieDtoResponse;
import in.saurabhit.service.CinemaHallService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CinemaHallServiceImpl implements CinemaHallService {


    @Autowired
    private CinemaHallRepository cinemaHallRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public CinemaHallDtoResponse addCinemaHall(CinemaHallDtoRequest cinemaHallDtoRequest) {

        CinemaHall cinemaHall = this.modelMapper.map(cinemaHallDtoRequest, CinemaHall.class);
        CinemaHall savedCinemaHall = this.cinemaHallRepository.save(cinemaHall);
        return this.modelMapper.map(savedCinemaHall, CinemaHallDtoResponse.class);
    }



    @Override
    public List<CinemaHallDtoResponse> getCinemaHallDetails() {

        List<CinemaHall> hallDetails = this.cinemaHallRepository.findAll();

        return hallDetails.stream().map((hall)->modelMapper.map(hall, CinemaHallDtoResponse.class)).collect(Collectors.toList());
    }



}
