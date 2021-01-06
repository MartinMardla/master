package JavaEstonia.demo.repositories;

import JavaEstonia.demo.entities.ConfirmationToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// For sending activation link to new user and controlling is it unused email
@Repository("confirmationTokenRepository")

public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String> {
    ConfirmationToken findByConfirmationToken(String confirmationToken);
}