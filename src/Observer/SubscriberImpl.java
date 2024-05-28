package Observer;

public class SubscriberImpl implements Subscriber{

    private String name;

    public SubscriberImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"--接到消息"+message);
    }
}
