package design.command;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/6 19:09
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.setStatus(true);
    }

    @Override
    public void undo() {
        this.light.setStatus(this.light.isStatus() ? false : true);
    }
}
