package design.visitor;

import java.util.List;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/23 15:07
 */
public class Application {
    public static void main(String[] args) {
        ComputerVisitor visitor = new ComputerVisitorImpl();
        Computer computer = new Computer();
        List<ComputerPart> list = computer.getParts();
        for (ComputerPart part : list) {
            part.accept(visitor);
        }
    }
}
