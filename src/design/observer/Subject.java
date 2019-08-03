package design.observer;

/**
 * @Title: Subject
 * @Description: 主题接口
 * @Auther: Sumray
 * @Version: 1.0
 * @create 2018/12/3 0:28
 */
public interface Subject {
    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();
}
