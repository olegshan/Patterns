package command;

/**
 * Created by Bors on 10.07.2016.
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n---- Remote control ----\n");

        for (int i = 0; i < onCommands.length; i++) {
            builder.append("[slot " + (i + 1) + "] " + onCommands[i].getClass().getSimpleName() + " " +
                    offCommands[i].getClass().getSimpleName() + "\n");
        }

        return builder.toString();
    }
}
