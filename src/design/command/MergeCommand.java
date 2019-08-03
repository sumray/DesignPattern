package design.command;

/**
 * @Title: MergeCommand
 * @Description: TODO
 * @Auther:
 * @Version: 1.0
 * @create 2019/4/8 20:08
 */
public class MergeCommand implements Command {
    private Command[] commands;

    public MergeCommand(Command[] commands) {
        this.commands = commands;
    }

    /**
     * @Description: 批量执行
     */
    @Override
    public void execute() {
        for (Command command : commands){
            command.execute();
        }
    }

    /**
     * @Description: 撤销
     */
    @Override
    public void undo() {
        commands[commands.length-1].undo();
    }
}
