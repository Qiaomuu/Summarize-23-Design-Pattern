package Factory.AbstractFactory;

interface Wheel {
}

class WheelA implements Wheel{
    public WheelA() {
        System.out.println("制造--WheelA");
    }
}
class WheelB implements Wheel{
    public WheelB() {
        System.out.println("制造--WheelB");
    }
}