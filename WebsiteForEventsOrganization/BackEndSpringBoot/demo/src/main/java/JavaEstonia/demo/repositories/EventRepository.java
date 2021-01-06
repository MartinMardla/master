package JavaEstonia.demo.repositories;

import JavaEstonia.demo.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {

    Event findByEventname(String eventname);
}
