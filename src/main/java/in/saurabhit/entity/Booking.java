package in.saurabhit.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "BOOKING_TBL")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;

    private List<Integer> seat;

    private Double totalAmount;

    private String status;

    @ManyToOne
    private User user;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private CinemaHall cinemaHall;


    @OneToOne(cascade = CascadeType.ALL)
    private ShowTime showTime;
}
