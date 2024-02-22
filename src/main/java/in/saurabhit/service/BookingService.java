package in.saurabhit.service;

import in.saurabhit.payload.BookingDtoRequest;
import in.saurabhit.payload.response.BookingDtoResponse;

import java.util.List;

public interface BookingService {

    BookingDtoResponse createBooking(Integer userId, Integer showTimeId, BookingDtoRequest bookingDtoRequest);

    List<BookingDtoResponse> getBookingsByUserId(Integer userId);
    List<BookingDtoResponse> getBookingsByMovieId(Integer movieId);
    List<BookingDtoResponse> getBookingsByCinemaHallId(Integer cinemaHallId);


}


