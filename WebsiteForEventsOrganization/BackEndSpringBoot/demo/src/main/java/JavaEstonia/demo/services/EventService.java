package JavaEstonia.demo.services;

import JavaEstonia.demo.entities.Event;
import JavaEstonia.demo.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {

    @Autowired
    EventRepository eventRepository;

    final EventRepository repository;
    final UserService service;

    public List<Event> getAllEvents(){
        List<Event> eventList = new ArrayList<>();
        repository.findAll().forEach(eventList::add);
        return eventList;
    }

    public Event getEventById(String id){
        return repository.findById(Long.valueOf(id)).get();
    }

    public Event findByEventname(String eventname) {return repository.findByEventname(eventname);}

    public Event saveEvent(Event event){
        Principal principal = SecurityContextHolder.getContext().getAuthentication();
        event.setUser(service.findByUsername(principal.getName()));
        event.setUpdated(new Date());
        if(event.getId() != null){
            event.setCreated(new Date());
        }
        return repository.save(event);
    }

    public void deleteEvent(String eventId){
        repository.deleteById(Long.valueOf(eventId));
    }
}
