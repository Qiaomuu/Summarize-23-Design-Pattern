package Factory.AbstractFactory;

public class FactoryA implements AbstractFactory{
    @Override
    public Engine createEngine(){
        return new EngineA();
    }

    @Override
    public Wheel createWheel() {
        return new WheelA();
    }
}
