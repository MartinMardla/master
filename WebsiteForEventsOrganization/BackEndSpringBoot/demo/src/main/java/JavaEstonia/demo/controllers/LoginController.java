package JavaEstonia.demo.controllers;

import JavaEstonia.demo.entities.User;
import JavaEstonia.demo.services.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class LoginController {

  /*  @GetMapping("response-text")
    public @ResponseBody String getResponse() {
        return "Hello Text";
    }*/

    final RegisterService registerService;

    @GetMapping("/login")
    String login() {return "login"; }

    @GetMapping("/register")
    String register() {
        return "register";
    }

    @PostMapping("/register")
    String createUser(@ModelAttribute User user, Model model) {
        User newUser = registerService.createUser(user);
        if( newUser != null)
            return "created-user";  //-- kasutaja oli uus, lisati andmebaasi
        else
            return "user-exists"; //-- sellise emailiga kasutaja oli olemas.
    }
}
