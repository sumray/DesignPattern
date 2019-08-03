package design.command;

/**
 * @Title: LightOffCommand
 * @Description: TODO
 * @Auther:
 * @Version: 1.0
 * @create 2019/3/30 22:49
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }

    @Override
    public void undo() {
        light.lightOn();
    }
}
