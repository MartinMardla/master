package JavaEstonia.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Event {

    @GeneratedValue
    @Id
    Long Id;
    Date eventtime;
    String eventname;
    String eventaddress;
    String access;
    String organizer;
    Date created;
    Date updated;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
    Boolean isPrivate;

}
