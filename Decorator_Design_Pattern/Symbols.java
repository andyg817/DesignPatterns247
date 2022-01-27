/**
 * Replaces certain characters in string with corresponding symbol
 * @author Andrew Garcia
 */
public class Symbols extends PasswordDecorator{
/**
 * Initializes passwordBeginning and calls getPassword
 * @param passwordBeginning beginning of password
 */
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
        password = passwordBeginning.getPassword();
    }
/**
 * Modifies password string by changing characters with symbols
 * @return String password
 */
    public String getPassword() {
        for(int i = 0; i < password.length(); i++) {
            if(password.charAt(i) == 'a') {
                password = password.replace('a','@');
            } else if(password.charAt(i) == 'b') {
                password = password.replace('b','8');
            } else if(password.charAt(i) == 'e') {
                password = password.replace('e','3');
            } else if(password.charAt(i) == 'g') {
                password = password.replace('g','9');
            } else if(password.charAt(i) == 'i') {
                password = password.replace('i','!');
            } else if(password.charAt(i) == 'o') {
                password = password.replace('o','0');
            } else if(password.charAt(i) == 's') {
                password = password.replace('s','$');
            } else if(password.charAt(i) == 't') {
                password = password.replace('t','7');
            }
        }
        return this.password;
    }
}
