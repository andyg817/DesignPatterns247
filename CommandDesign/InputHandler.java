package command;

import java.util.HashMap;

/**
 * InputHandler class
 * @author rleboeu
 * @version 1.0.0
 */
public class InputHandler {

    // fields
    private HashMap<String, Command> commands;

    /**
     * Constructor
     * @param player to handle the input for
     */
    public InputHandler(Player player) {
        this.commands = new HashMap<String, Command>();

        commands.put("jump", new JumpCommand(player));
        commands.put("run", new RunCommand(player));
        commands.put("fire", new FireCommand(player));
        commands.put("quit", new QuitCommand(player));
    }

    /**
     * Executes the command for the button that was pressed
     * @param button that was pressed, represented as a String
     */
    public void buttonPressed(String button) {
        commands.get(button).execute();
    }

}