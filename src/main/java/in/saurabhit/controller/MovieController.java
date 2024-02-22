package in.saurabhit.controller;

import in.saurabhit.payload.request.MovieDtoRequest;
import in.saurabhit.payload.response.MovieDtoResponse;
import in.saurabhit.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping("/movie")
    public ResponseEntity<MovieDtoResponse> addMovie(@Valid @RequestBody MovieDtoRequest movieDtoRequest){

        MovieDtoResponse movieDtoResponse = this.movieService.addNewMovie(movieDtoRequest);

        return new ResponseEntity<>(movieDtoResponse, HttpStatus.CREATED);


    }

    @GetMapping("/movie/{MovieId}")
    public ResponseEntity<List<MovieDtoResponse>> getAllMovies(@PathVariable Integer movieId)
    {
        List<MovieDtoResponse> allMovies = this.movieService.getAllMovies(new MovieDtoRequest());

        return new ResponseEntity<>(allMovies,HttpStatus.OK);
    }




}
