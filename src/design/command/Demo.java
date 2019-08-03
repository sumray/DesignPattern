package design.command;

/**
 * @Title: Demo
 * @Description: TODO
 * @Auther:
 * @Version: 1.0
 * @create 2019/3/30 22:49
 */
public class Demo {
    public static void main(String[] args) {
        Light light = new Light();
        SimpleRemoteController remote = new SimpleRemoteController();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        remote.setOnCommand(0, lightOnCommand);
        remote.setOffCommand(0,lightOffCommand);

        remote.pressOnButton(0);
        remote.pressOffButton(0);
        remote.undo();

        //测试宏
        Command[] commands = {lightOffCommand, lightOnCommand};
        MergeCommand mergeCommand = new MergeCommand(commands);
        System.out.println("测试宏命令");
        mergeCommand.execute();
    }
}
