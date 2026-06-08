package command.app;

import command.command.TurnOffCommand;
import command.command.TurnOnCommand;
import command.invoker.RemoteControl;
import command.receiver.Light;

public class Main {

    public static void main(String[] args) {

        Light light = new Light();

        TurnOnCommand turnOn = new TurnOnCommand(light);
        TurnOffCommand turnOff = new TurnOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();
    }
}
