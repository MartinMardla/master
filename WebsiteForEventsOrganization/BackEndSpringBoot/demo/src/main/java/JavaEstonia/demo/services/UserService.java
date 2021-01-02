package JavaEstonia.demo.services;

import JavaEstonia.demo.entities.User;
import JavaEstonia.demo.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    final UserRepository repository;

    public User findByUsername(String username) {return repository.findByUsername(username);}
}
