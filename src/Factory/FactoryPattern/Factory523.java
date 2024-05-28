package Factory.FactoryPattern;

import Factory.Bean.BMW;
import Factory.Bean.BMW523;

public class Factory523 implements Factory{
    @Override
    public BMW createBMW(){
        return new BMW523();
    }
}
