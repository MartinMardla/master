package JavaEstonia.demo.controllers;


import JavaEstonia.demo.entities.Event;
import JavaEstonia.demo.repositories.UserRepository;
import JavaEstonia.demo.services.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/events")
public class EventController {

    final EventService service;
    final UserRepository repository;

    @GetMapping("/show-events")
    String showPosts(Model model){
        model.addAttribute("events", service.getAllEvents());
        return "show-events";
    }

    @GetMapping("/create-event")
    String createEvent(){
        return "create-event";
    }

    @PostMapping("/save-event")
    ModelAndView saveEvent(@ModelAttribute Event event){
        service.saveEvent(event);
        return new ModelAndView("redirect:/events/show-events");
    }

    @GetMapping("/edit-event/{eventId}")
    String editEvent(@PathVariable String eventId, Model model){
        model.addAttribute(service.getEventById(eventId));
        return "edit-event";
    }

    @GetMapping("/delete-event/{eventId}")
    ModelAndView deleteEvent(@PathVariable String eventId){
        service.deleteEvent(eventId);
        return new ModelAndView("redirect:/events/show-events");
    }
}
