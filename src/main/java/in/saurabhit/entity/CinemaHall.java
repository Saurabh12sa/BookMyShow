package in.saurabhit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CINEMA_HALL")
public class CinemaHall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hallId;

    private String hallName;

    private String location;

    private Integer seatingCapacity;

    private Integer screens;

    @OneToMany(mappedBy = "cinemaHall",cascade = CascadeType.ALL)
    private List<ShowTime> showTime=new ArrayList<>();




}
