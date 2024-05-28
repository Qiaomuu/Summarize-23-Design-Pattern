package Observer;

public class TestObserver {
    public static void main(String[] args) {
        /**
         * 先创建两个观察者,小李，小杨
         */
        Subscriber subscriber1 = new SubscriberImpl("小李");
        Subscriber subscriber2 = new SubscriberImpl("小杨");

        /**
         * 创建被观察者，通知虽有观察者
         */
        NewsPaper newsPaper = new NewsPaperImpl();
        newsPaper.addSubscriber(subscriber1);
        newsPaper.addSubscriber(subscriber2);
        newsPaper.notifySubscriber("今天西瓜半价");

        /**
         * 删除小李，再通知
         */
        newsPaper.removeSubscriber(subscriber1);
        newsPaper.notifySubscriber("还剩最后一盒西瓜了");
    }
}
