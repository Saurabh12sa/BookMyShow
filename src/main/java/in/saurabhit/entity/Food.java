package in.saurabhit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "FOOD_TBL")
public class Food{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer foodItemId;


    @Column(name = "ITEM_NAME")
    private String itemName;

    private Double price;

}
