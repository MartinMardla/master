package JavaEstonia.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @GeneratedValue
    @Id

    Long id;
    String username;
    String password;
    String email;
    String firstname;
    String lastname;
    Date dateOfBirth;

    @OneToMany(mappedBy = "user")
    List<Event> eventList;
}
