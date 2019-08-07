package design.command;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/6 19:09
 */
public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.setStatus(false);
    }

    @Override
    public void undo() {
        this.light.setStatus(this.light.isStatus() ? false : true);
    }
}
