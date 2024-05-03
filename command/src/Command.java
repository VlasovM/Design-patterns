import commands.impl.LightOffCommand;
import commands.impl.LightOnCommand;
import commands.impl.StereoOffCommand;
import commands.impl.StereoOnCommand;
import commands.parts.Light;
import commands.parts.Stereo;

public class Command {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControlWithUndo.setOnCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControlWithUndo.setOnCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControlWithUndo.setOnCommand(2, stereoOnCommand, stereoOffCommand);

        System.out.println(remoteControlWithUndo);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.onButtonWasPushed(1);
        remoteControlWithUndo.offButtonWasPushed(1);
        remoteControlWithUndo.onButtonWasPushed(2);
        remoteControlWithUndo.offButtonWasPushed(2);

    }

}
