package design.command;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/6 19:04
 */
public class Application {
    public static void main(String[] args) {
        Light light = new Light();
        Television tv = new Television();
        RemoteControl remote = new RemoteControl();
        Command lightOffCommand = new LightOffCommand(light);
        Command lightOnCommand = new LightOnCommand(light);
        Command tvOffCommand = new TelevisionOffCommand(tv);
        Command tvOnCommand = new TelevisionOnCommand(tv);

        remote.setOnCommand(0, lightOnCommand);
        remote.setOnCommand(1, tvOnCommand);
        remote.setOffCommand(0, lightOffCommand);
        remote.setOffCommand(1, tvOffCommand);

        remote.startOnCommand(1);
        System.out.println(tv);
        System.out.println("------------------");
        remote.startOffCommand(1);
        System.out.println(tv);
        System.out.println("------------------");
        remote.undo();
        System.out.println(tv);
        System.out.println("------------------");
        remote.undo();
        System.out.println(tv);
    }
}
