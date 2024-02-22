package in.saurabhit.Repository;

import in.saurabhit.entity.ShowTime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowTimeRepository extends JpaRepository<ShowTime,Integer> {

    List<ShowTime> findByMovieMovieId(String movieId);
    List<ShowTime> findByCinemaHallHallId(String hallId);

}
