package design.visitor;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/23 14:35
 */
public interface ComputerPart {
    void accept(ComputerVisitor visitor);
}
