import java.util.*;
/**
 * Abstract class that will set and return password
 * @author Andrew Garcia
 */
public abstract class PasswordDecorator extends Password{
    protected Password passwordBeginning;
/**
 * Initializes beginning of password
 * @param passwordBeginning beginning of password
 */
    public PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }
/**
 * returns password
 * @return string password
 */
    public String getPassword() {
        return this.password;
    }
}
