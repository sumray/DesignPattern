package design.visitor;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/23 14:43
 */
public class Cpu implements ComputerPart {
    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visit(this);
    }
}
