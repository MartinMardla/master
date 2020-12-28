package JavaEstonia.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Participation {

    @GeneratedValue
    @Id
    Long id;
    String event;
    String user;
    String organizerApproval;
    String participantsApproval;

}
