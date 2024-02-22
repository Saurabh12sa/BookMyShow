package in.saurabhit.service;

import in.saurabhit.payload.request.MovieDtoRequest;
import in.saurabhit.payload.response.MovieDtoResponse;

import java.util.List;

public interface MovieService {

       MovieDtoResponse addNewMovie(MovieDtoRequest movieDtoRequest);
       List<MovieDtoResponse> getAllMovies(MovieDtoRequest movieDtoRequest);
}
