package in.saurabhit.service.impl;

import in.saurabhit.Repository.CinemaHallRepository;
import in.saurabhit.Repository.MovieRepository;
import in.saurabhit.Repository.ShowTimeRepository;
import in.saurabhit.entity.CinemaHall;
import in.saurabhit.entity.Movie;
import in.saurabhit.entity.ShowTime;
import in.saurabhit.exception.ResourceNotFoundException;
import in.saurabhit.payload.request.ShowTimeDtoRequest;
import in.saurabhit.payload.response.ShowTimeDtoResponse;
import in.saurabhit.service.ShowTimeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShowTimeServiceImpl implements ShowTimeService {

    @Autowired
    private ShowTimeRepository showTimeRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private CinemaHallRepository cinemaHallRepository;
    @Override
    public ShowTimeDtoResponse addNewShowTime(ShowTimeDtoRequest showTimeDtoRequest, Integer movieId, Integer hallId) {
        {
            Movie movie = this.movieRepository.findById(movieId).orElseThrow(() -> new ResourceNotFoundException("Movie", "MovieId",movieId));
            CinemaHall cinemaHall = this.cinemaHallRepository.findById(hallId).orElseThrow(() -> new ResourceNotFoundException("CinemaHall", "HallId", hallId));

            ShowTime show = this.modelMapper.map(showTimeDtoRequest, ShowTime.class);

            show.setMovie(movie);
            show.setCinemaHall(cinemaHall);

            ShowTime savedShow = this.showTimeRepository.save(show);

            return this.modelMapper.map(savedShow, ShowTimeDtoResponse.class);
        }
    }

    @Override
    public List<ShowTimeDtoResponse> getShowTimeDetails() {
        List<ShowTime> allShowTimes = this.showTimeRepository.findAll();
        List<ShowTimeDtoResponse> collect = allShowTimes.stream()
                                            .map((show) -> modelMapper
                                                    .map(show, ShowTimeDtoResponse.class))
                                                    .collect(Collectors.toList());
        return collect;

    }

    @Override
    public List<ShowTimeDtoResponse> getShowTimesByMovieId(String movieId) {
        List<ShowTime> showTimesByMovieId = this.showTimeRepository.findByMovieMovieId(movieId);
        return showTimesByMovieId.stream().map((showTime)->modelMapper.map(showTime, ShowTimeDtoResponse.class)).collect(Collectors.toList());

    }

    @Override
    public List<ShowTimeDtoResponse> getShowTimesByCinemaHallId(String hallId) {

        List<ShowTime> byCinemaHallHallId = this.showTimeRepository.findByCinemaHallHallId(hallId);

        return byCinemaHallHallId.stream().map((showTime)->modelMapper.map(showTime, ShowTimeDtoResponse.class)).collect(Collectors.toList());
    }

    }

