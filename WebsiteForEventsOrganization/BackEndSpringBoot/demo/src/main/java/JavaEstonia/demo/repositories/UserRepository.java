package JavaEstonia.demo.repositories;

import JavaEstonia.demo.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")

public interface UserRepository extends CrudRepository<User, String>{

    public static User findByEmail(String emailId) {
        return null;
    }

    User findByEmailIdIgnoreCase(String emailId);
    User findByUsername(String username);

}
