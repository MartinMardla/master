package JavaEstonia.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

    @GeneratedValue
    @Id
    @Column(name = "user_id")
    //@Column(unique = true)
    Long id;
    @Column(name = "username")
    String username;
    String password;
    String emailID;
    String firstname;
    String lastname;
    Date dateOfBirth;

    @OneToMany(mappedBy = "user")
    List<Event> eventList;

    public String getEmailId() {
        return null;
    }

    public void setEnabled(boolean b) {
    }
}
