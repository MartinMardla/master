package JavaEstonia.demo.repositories;

import JavaEstonia.demo.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
    static User findByEmail(String emailId) {
        return null;
    }

    User findByUsername(String username);

    User findByResetPasswordToken(String token);
}


    /*// For Password reset
    @Query("SELECT c FROM User c WHERE c.emailId = ?1")
   // public User findByEmail(String email);

    public User findByResetPasswordToken(String token);
}*/


