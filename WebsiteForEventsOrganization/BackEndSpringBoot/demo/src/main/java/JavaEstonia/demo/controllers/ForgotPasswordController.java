package JavaEstonia.demo.controllers;
/*
import JavaEstonia.demo.entities.Utility;
import JavaEstonia.demo.services.UserService;
import jpaoletti.jpm.security.core.UserNotFoundException;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
public class ForgotPasswordController {
    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private UserService userService;

    @GetMapping("/forgot-password")
    public void showForgotPasswordForm() {
        return "forgot-password-form";
    }

    @PostMapping("/forgot-password")
    public void processForgotPassword() {
    }

    public void sendEmail(){

    }


    @GetMapping("/reset-password")
    public void showResetPasswordForm() {

    }

    @PostMapping("/reset-password")
    public void processResetPassword() {

    }

    // process the forgot password form, code to send reset password email

    @PostMapping("/forgot-password")
    public String processForgotPassword(HttpServletRequest request, Model model) {
        String email = request.getParameter("emailId");
        String token = RandomString.make(30);

        try {
            userService.updateResetPasswordToken(token, email);
            String resetPasswordLink = Utility.getSiteURL(request) + "/reset_password?token=" + token;
            sendEmail(email, resetPasswordLink);
            model.addAttribute("message", "We have sent a reset password link to your email. Please check.");

        } catch (UserNotFoundException ex) {
            model.addAttribute("error", ex.getMessage());
        } catch (UnsupportedEncodingException | MessagingException e) {
            model.addAttribute("error", "Error while sending email");
        }

        return "forgot-password-form";
    }
}*/