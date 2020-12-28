package JavaEstonia.demo.configurations.security_password;

public interface PasswordEncoder {
    
    String encode(CharSequence rawPassword);

    boolean matches(CharSequence rawPassword, String encodePassword);
}
