package command;

/**
 * Created by Bors on 10.07.2016.
 */
public class RemoteControlTest {

    public static void main(String[] args) {

        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        remote.setCommand(0, lightOn, lightOff);

        System.out.println(remote);

        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);

    }

}
