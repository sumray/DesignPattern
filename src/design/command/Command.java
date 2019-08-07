package design.command;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/6 19:03
 */
public interface Command {
    void execute();

    void undo();
}
