package in.saurabhit.Repository;

import in.saurabhit.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking,Integer> {

   public List<Booking> findByUserUserId(Integer userId);
   public List<Booking> findByMovieMovieId(Integer movieId);

   public List<Booking> findByCinemaHallHallId(Integer hallId);
}
