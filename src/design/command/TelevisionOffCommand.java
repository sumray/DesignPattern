package design.command;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/6 19:03
 */
public class TelevisionOffCommand implements Command{
    private Television television;

    public TelevisionOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        this.television.setStatus(false);
    }

    @Override
    public void undo() {
        this.television.setStatus(this.television.isStatus() ? false : true);
    }
}
