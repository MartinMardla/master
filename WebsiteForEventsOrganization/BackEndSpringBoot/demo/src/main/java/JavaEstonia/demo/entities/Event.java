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
    String eventname;
    String eventaddress;
    Date eventdate;
    String eventtime;
    String access;
    String organizer;
    Date created;
    Date updated;
    String eventdescription;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
    Boolean isPrivate;

}
