package design.command;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/6 19:11
 */
public class Light {
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "点灯现在" + (status ? "正在开启" : "已经关闭了");
    }
}
