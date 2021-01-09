package JavaEstonia.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
//@Table(name = "users")
public class User {

    @GeneratedValue(strategy=GenerationType.AUTO)
  //  @GeneratedValue
    @Id
  //  @Column(name = "user_id")
    //@Column(unique = true)
    Long id;
    @Column(name = "username")
    String username;
    String password;
    String email;
    String firstname;
    String lastname;
    Date dateOfBirth;
    Boolean enabled;

    // for forgot password
    @Column(name = "reset-password-token")
    String resetPasswordToken;

    @OneToMany(mappedBy = "user")
    List<Event> eventList;

}