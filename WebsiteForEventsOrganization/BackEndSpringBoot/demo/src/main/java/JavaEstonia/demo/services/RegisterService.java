package JavaEstonia.demo.services;

import JavaEstonia.demo.entities.User;
import JavaEstonia.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {
    @Autowired
    BCryptPasswordEncoder encoder;

    @Autowired
    UserRepository userRepository;

    public User createUser(User user){
        //-- pärime andmebaasist, kas sellise emailiga kasutaja on juba olemas...
        User found = UserRepository.findByEmail(user.getEmailId());

        //-- Kui tagastatud user (found) on null, siis sellist emaili veel pole andmebaases
        if(found == null)
        {
            user.setPassword(encoder.encode(user.getPassword()));
            return userRepository.save(user);
        }else{ //-- email juba on andmebaases
            System.out.print("User exists");
            return null;

        }

    }
}