package Factory.FactoryPattern;

import Factory.Bean.BMW;
import Factory.Bean.BMW320;

public class Factory320 implements Factory{
    @Override
    public BMW createBMW(){
        return new BMW320();
    }
}
