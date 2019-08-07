package design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/6 19:15
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[2];
        offCommands = new Command[2];
        undoCommand =  new NoCommand();
        for (int i=0; i<onCommands.length; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setOnCommand(int index, Command onCommand){
        onCommands[index] = onCommand;
    }

    public void setOffCommand(int index, Command offCommand){
        offCommands[index] = offCommand;
    }

    public void startOnCommand(int index){
        onCommands[index].execute();
        undoCommand = onCommands[index];
    }

    public void startOffCommand(int index){
        offCommands[index].execute();
        undoCommand = offCommands[index];
    }

    public void undo(){
        undoCommand.undo();
    }
}
