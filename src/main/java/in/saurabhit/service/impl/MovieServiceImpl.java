package in.saurabhit.service.impl;

import in.saurabhit.Repository.MovieRepository;
import in.saurabhit.entity.Movie;
import in.saurabhit.payload.request.MovieDtoRequest;
import in.saurabhit.payload.response.MovieDtoResponse;
import in.saurabhit.service.MovieService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public MovieDtoResponse addNewMovie(MovieDtoRequest movieDtoRequest) {

        Movie movie = this.modelMapper.map(movieDtoRequest, Movie.class);
        Movie savedMovie = this.movieRepository.save(movie);
        return this.modelMapper.map(savedMovie, MovieDtoResponse.class);
    }

    @Override
    public List<MovieDtoResponse> getAllMovies(MovieDtoRequest movieDtoRequest) {

        List<Movie> all = this.movieRepository.findAll();
        List<MovieDtoResponse> movieDtoRequestList = all.stream().map((movie) -> modelMapper.map(movie, MovieDtoResponse.class)).collect(Collectors.toList());
        return movieDtoRequestList;
    }
}

