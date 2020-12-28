package JavaEstonia.demo.services;

import JavaEstonia.demo.entities.Event;
import JavaEstonia.demo.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {

    final EventRepository repository;
    final UserService service;

    public List<Event> getAllEvents(){
        List<Event> eventList = new ArrayList<>();
        repository.findAll().forEach(eventList::add);
        return eventList;
    }
}
