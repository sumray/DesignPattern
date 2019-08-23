package design.visitor;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/23 14:41
 */
public interface ComputerVisitor {
    void visit(Cpu cpu);

    void visit(Gpu gpu);

    void visit(Keyboard keyboard);
}
