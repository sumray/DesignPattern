package design.command;

/**
 * @Title: LightOnCommand
 * @Description: TODO
 * @Auther:
 * @Version: 1.0
 * @create 2019/3/30 22:47
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }

    @Override
    public void undo(){
        light.lightOff();
    }
}
