package design.command;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/6 19:04
 */
public class TelevisionOnCommand implements Command {
    private Television television;

    public TelevisionOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        this.television.setStatus(true);
    }

    @Override
    public void undo() {
        this.television.setStatus(this.television.isStatus() ? false : true);
    }
}
