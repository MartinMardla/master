package JavaEstonia.demo.repositories;

import JavaEstonia.demo.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{

    User findByUsername(String username);
}
