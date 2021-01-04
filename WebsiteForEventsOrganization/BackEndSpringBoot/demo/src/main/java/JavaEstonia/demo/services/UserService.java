package JavaEstonia.demo.services;

import JavaEstonia.demo.entities.User;
import JavaEstonia.demo.repositories.UserRepository;
import jpaoletti.jpm.security.core.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    final UserRepository repository;

    public User findByUsername(String username) {return repository.findByUsername(username);}

    // For password reset

    @Autowired
    private UserRepository userRepository;


    public void updateResetPasswordToken(String token, String emailId) throws UserNotFoundException {
        User user = UserRepository.findByEmail(emailId);
        if (user != null) {
            user.setResetPasswordToken(token);
            userRepository.save(user);
        } else {
            throw new UserNotFoundException("Could not find any customer with the email " + emailId);
        }
    }

    public User getByResetPasswordToken(String token) {
        return userRepository.findByResetPasswordToken(token);
    }

    public void updatePassword(User user, String newPassword) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(newPassword);
        user.setPassword(encodedPassword);

        user.setResetPasswordToken(null);
        userRepository.save(user);
    }

}
