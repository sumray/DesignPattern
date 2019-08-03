package design.command;

/**
 * @Title: SimpleRemoteController
 * @Description: TODO
 * @Auther:
 * @Version: 1.0
 * @create 2019/3/30 22:06
 */
public class SimpleRemoteController {
    private static final int size = 3;
    private Command[] onCommand;
    private Command[] offCommand;
    private Command undoCommand;

    //初始化命令数组
    public SimpleRemoteController() {
        Command noCommand = new NoCommand();
        onCommand = new Command[size];
        offCommand = new Command[size];
        for (int i=0; i<size; i++){
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setOnCommand(int index, Command command){
        if (index >= size || index < 0){
            System.out.println("不存在该插槽！");
            return;
        }
        onCommand[index] = command;
    }

    public void setOffCommand(int index, Command command){
        if (index >= size || index < 0){
            System.out.println("不存在该插槽！");
            return;
        }
        offCommand[index] = command;
    }

    public void pressOnButton(int index){
        if (index >= size || index < 0){
            System.out.println("不存在该插槽！");
            return;
        }
        System.out.println("现在按下第" + (index + 1) + "个打开按钮！");
        onCommand[index].execute();
        undoCommand = onCommand[index];
    }

    public void pressOffButton(int index){
        if (index >= size || index < 0){
            System.out.println("不存在该插槽！");
            return;
        }
        System.out.println("现在按下第" + (index + 1) + "个关闭按钮！");
        offCommand[index].execute();
        undoCommand = offCommand[index];
    }

    /**
     * @Description: 撤销按钮
     */
    public void undo(){
        undoCommand.undo();
    }
}
