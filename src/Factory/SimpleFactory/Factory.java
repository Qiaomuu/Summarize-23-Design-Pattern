package Factory.SimpleFactory;
import Factory.Bean.*;

public class Factory {
    public BMW createBMW(String type){
        if(type.equals("320")) return new BMW320();
        else if(type.equals("523")) return new BMW523();
        else return null;
    }
}
