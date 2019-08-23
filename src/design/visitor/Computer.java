package design.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/23 14:34
 */
public class Computer{
    private List<ComputerPart> partList;

    public Computer() {
        partList = new ArrayList<>();
        partList.add(new Keyboard());
        partList.add(new Cpu());
        partList.add(new Gpu());
    }

    public List<ComputerPart> getParts(){
        return partList;
    }

}
