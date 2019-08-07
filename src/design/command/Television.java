package design.command;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/6 19:11
 */
public class Television {
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "电视现在" + (status ? "正在播放动物世界" : "是关闭的");
    }
}
