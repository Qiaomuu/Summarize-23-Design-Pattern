package Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPaperImpl implements NewsPaper{
    List<Subscriber> subscriberList = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String message) {
        for(Subscriber subscriber:subscriberList){
            subscriber.update(message);
        }
    }
}
