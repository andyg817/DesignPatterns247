public class RandomCasing extends PasswordDecorator{
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
        this.passwordBeginning = passwordBeginning;
    }
    public String getPassword() {
        for(int i = 0; i < password.length(); i++) {
            int min = 1, max = 2;
            int rand = (int)Math.floor(Math.random()*(max-min+1)+min);
            if(rand == 1) {
                char Char = password.charAt(i);
                Char = Character.toUpperCase(password.charAt(i));
                password.replace(password.charAt(i),Char);
            } else {
                char Char = password.charAt(i);
                Char = Character.toLowerCase(password.charAt(i));
                password.replace(password.charAt(i),Char);
            }
        }
        return this.password;
    }
}
