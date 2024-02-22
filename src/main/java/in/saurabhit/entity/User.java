package in.saurabhit.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "USER_TBL")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String fname;

    private String lname;

    private String dob;

    private String email;

    private String password;

    @Data
    @NoArgsConstructor
    public static class ResourceNotFoundException extends RuntimeException {

        String resourceName;

        String fieldName;

        Long fieldValue;

        public ResourceNotFoundException(String resourceName,String fieldName,Long fieldValue) {
            super(String.format("%s not found with %s : %s",resourceName,fieldName,fieldValue));
            this.resourceName = resourceName;
            this.fieldName=fieldName;
            this.fieldValue=fieldValue;
        }
    }
}
