package in.saurabhit.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "MOVIE_TBL")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    private String movieTitle;

    private Double ticketPrice;

    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
    private List<ShowTime> showTimes=new ArrayList<>();
}
