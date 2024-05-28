package Factory.AbstractFactory;

public class FactoryB implements AbstractFactory{
    @Override
    public Engine createEngine(){
        return new EngineB();
    }

    @Override
    public Wheel createWheel() {
        return new WheelB();
    }
}
