import java.util.*;
/**
 * Deletes spaces in string and adds number at end
 * @author Andrew Garcia
 */
public class EasyPassword extends Password{
/**
 * Takes in phrase, deletes white space and adds random number. Thus creating password
 * @param phrase String input by user
 */
    public EasyPassword(String phrase) {
        this.password = phrase;
        int min = 0, max = 100;
        int Rando = (int)Math.floor(Math.random()*(max-min+1)+min);
        String rand = Integer.toString(Rando);
        password = password + rand;
        password = password.replaceAll("\\s+", "");
//Reference to https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
    }
/**
 * returns password
 * @return string password
 */
    public String getPassword() {
        return this.password;
    }
}
