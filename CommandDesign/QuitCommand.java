package command;

/**
 * Quites out of the program
 * @author Miller Banford
 * @version 1.0.0
 */
public class QuitCommand implements Command {

    private Player player;
    
    /**
     * Constructor
     * @param player parent of the command
     */
    public QuitCommand(Player player) {

        this.player = player;

    }

    /**
     * Execute the QuitCommand
     */
    public void execute() {
        
        System.exit(0);

    }
    
}
