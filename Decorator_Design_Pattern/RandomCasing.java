/**
 * Upper and lower cases random characters in password
 * @author Andrew Garcia
 */
public class RandomCasing extends PasswordDecorator{
/**
 * Initializes passwordBeginning and calls getPassword
 * @param passwordBeginning beginning of password
 */
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
        this.passwordBeginning = passwordBeginning;
        password = passwordBeginning.getPassword();
    }
/**
 * Modifies password by upper and lower casing random characters 50% of time
 * @return String password modified
 */
    public String getPassword() {
        for(int i = 0; i < password.length(); i++) {
            int min = 1, max = 2;
            int rand = (int)Math.floor(Math.random()*(max-min+1)+min);
            if(rand == 1) {
                char Char = password.charAt(i);
                Char = Character.toUpperCase(password.charAt(i));
                password = password.replace(password.charAt(i),Char);
            } else {
                char Char = password.charAt(i);
                Char = Character.toLowerCase(password.charAt(i));
                password = password.replace(password.charAt(i),Char);
            }
        }
        return this.password;
    }
}
