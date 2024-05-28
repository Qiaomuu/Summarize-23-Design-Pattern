package Observer;

/**
 * 观察者模式又被成为发布-订阅模式，描述了对象之间一对多的依赖关系，但目标对象（被观察者）的状态发生改变时，他的所有观察者都将收到通知：
 */
public interface NewsPaper {
    /**
     * 增加订阅者
     * @param subscriber
     */
    public void addSubscriber(Subscriber subscriber);

    /**
     * 删除订阅者
     * @param subscriber
     */
    public void removeSubscriber(Subscriber subscriber);

    /**
     * 通知订阅者
     * @param subscriber
     */
    public void notifySubscriber(String message);

}
