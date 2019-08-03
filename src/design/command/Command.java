package design.command;

/**
 * @Title: Command
 * @Description: TODO
 * @Auther:
 * @Version: 1.0
 * @create 2019/3/30 22:07
 */
public interface Command {
    //执行
    void execute();

    //撤销到上一步操作
    void undo();
}
