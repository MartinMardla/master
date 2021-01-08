package JavaEstonia.demo.repositories;

import JavaEstonia.demo.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")

public interface UserRepository extends CrudRepository<User, String>{

    // For sending activation link to new user and controlling is it unused email
    User findByEmailId(String emailId);

    User findByUsername(String username);

    // For sending activation link to new user and controlling is it unused email
    User findByEmailIdIgnoreCase(String emailId);


    /*// For Password reset
    @Query("SELECT c FROM User c WHERE c.emailId = ?1")
   // public User findByEmail(String email);

    public User findByResetPasswordToken(String token);*/
}


