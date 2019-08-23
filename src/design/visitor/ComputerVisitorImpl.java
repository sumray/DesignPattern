package design.visitor;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/23 14:47
 */
public class ComputerVisitorImpl implements ComputerVisitor {
    @Override
    public void visit(Cpu cpu) {
        System.out.println("这是一块cpu");
    }

    @Override
    public void visit(Gpu gpu) {
        System.out.println("这是一块显卡");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("这是一个cherry键盘");
    }
}
