package JavaEstonia.demo.controllers;

import JavaEstonia.demo.entities.User;
import JavaEstonia.demo.repositories.UserRepository;
import JavaEstonia.demo.services.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class LoginController {

    final RegisterService registerService;

    @GetMapping("/login")
    String login() {return "login"; }

    @GetMapping("/register")
    String register() {return "register"; }

   /* @PostMapping("/register")
    String createUser(@ModelAttribute User user, Model model) {
        System.out.println("DEBUG kasutaja eesnimi: "+ user.getFirstname());
        registerService.createUser(user);
     //   model.addAttribute("user", registerService.createUser(user));
        return "created-user"; */


    // For sending activation link to new user and controlling is it unused email
    @PostMapping("/register")
    String createUser(@ModelAttribute User user, Model model) {

        if(null== UserRepository.findByEmail(user.getEmailId()))
        {
            registerService.createUser(user);
            return "created-user";
        }else{

            return "This e-mail is already in use!";
        }

    }
}
