package JavaEstonia.demo.configurations.security_password;

import JavaEstonia.demo.repositories.PasswordEncoderRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCrypt;

@Configuration
public class PasswordEncoderConfig {

    @Bean
    public PasswordEncoderRepository passwordEncoder() {
        return new PasswordEncoderRepository() {

          //  @Override
            public String encode(CharSequence rawPassword) {

                return BCrypt.hashpw(rawPassword.toString(), BCrypt.gensalt(4));
            }

          //  @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {

                return BCrypt.checkpw(rawPassword.toString(), encodedPassword);
            }
        };
    }
}
