import java.util.*;
public class SpecialChars extends PasswordDecorator{
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
        this.passwordBeginning = passwordBeginning;
    }
    public String getPassword() {
        for(int i = 0; i < password.length(); i++) {
            int min = 1, max = 3;
            int rand = (int)Math.floor(Math.random()*(max-min+1)+min);
            if(rand == 2) {
                Random random = new Random();
                String Specialchars = "*!%+.{}";
                int ranInt = random.nextInt(Specialchars.length());
                char ranChar = Specialchars.charAt(ranInt);
                password = password.substring(0, password.charAt(i)) + ranChar + password.substring(password.charAt(i));
//Reference to https://www.delftstack.com/howto/java/java-random-character/
//Reference to https://www.baeldung.com/java-add-character-to-string
            }
        }
        return this.password;
    }
}
