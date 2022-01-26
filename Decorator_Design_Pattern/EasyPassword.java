import java.util.*;
public class EasyPassword extends Password{
    public EasyPassword(String phrase) {
        this.password = phrase;
    }
    public String getPassword() {
        int min = 0, max = 100;
        int Rando = (int)Math.floor(Math.random()*(max-min+1)+min);
        String rand = Integer.toString(Rando);
        password = password + rand;
        password = password.replaceAll("\\s+", "");
//Reference to https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
        return this.password;
    }
}
