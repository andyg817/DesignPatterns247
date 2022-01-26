public class Symbols extends PasswordDecorator{
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
        this.passwordBeginning = passwordBeginning;
    }
    public String getPassword() {
        for(int i = 0; i < password.length(); i++) {
            if(password.charAt(i) == 'a') {
                password.replace('a','@');
            } else if(password.charAt(i) == 'b') {
                password.replace('b','8');
            } else if(password.charAt(i) == 'e') {
                password.replace('e','3');
            } else if(password.charAt(i) == 'g') {
                password.replace('g','9');
            } else if(password.charAt(i) == 'i') {
                password.replace('i','!');
            } else if(password.charAt(i) == 'o') {
                password.replace('o','0');
            } else if(password.charAt(i) == 's') {
                password.replace('s','$');
            } else if(password.charAt(i) == 't') {
                password.replace('t','7');
            }
        }
        return this.password;
    }
}
