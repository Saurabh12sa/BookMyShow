package in.saurabhit.service;

import in.saurabhit.payload.request.ShowTimeDtoRequest;
import in.saurabhit.payload.response.ShowTimeDtoResponse;

import java.util.List;

public interface ShowTimeService {

    ShowTimeDtoResponse addNewShowTime(ShowTimeDtoRequest showTimeDtoRequest, Integer movieId, Integer hallId);

    List<ShowTimeDtoResponse> getShowTimeDetails();

    List<ShowTimeDtoResponse> getShowTimesByMovieId(String movieId);

    List<ShowTimeDtoResponse> getShowTimesByCinemaHallId(String hallId);

}
