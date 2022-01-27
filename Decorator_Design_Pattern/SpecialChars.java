import java.util.*;
/**
 * Adds speecial characters in password
 * @author Andrew Garcia
 */
public class SpecialChars extends PasswordDecorator{
/**
 * Initializes passwordBeginning and calls getPassword
 * @param passwordBeginning beginning of password
 */
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
        this.passwordBeginning = passwordBeginning;
        password = passwordBeginning.getPassword();
    }
/**
 * Adds special characters 30% of the time in password
 * @return string password modified
 */
    public String getPassword() {
        for(int i = 0; i < password.length(); i++) {
            int min = 1, max = 3;
            int rand = (int)Math.floor(Math.random()*(max-min+1)+min);
            if(rand == 2) {
                Random random = new Random();
                String Specialchars = "*!%+.{}";
                char ranChar = Specialchars.charAt(random.nextInt(Specialchars.length()));
                password = password.substring(0, i) + ranChar + password.substring(i);
//Reference to https://programming.guide/java/generate-random-character.html
//Reference to https://www.delftstack.com/howto/java/add-char-to-string-java/
            }
        }
        return this.password;
    }
}
