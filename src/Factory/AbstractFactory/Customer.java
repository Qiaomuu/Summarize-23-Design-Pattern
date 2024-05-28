package Factory.AbstractFactory;

/**
 * 抽象工厂涉及四个角色：
 * 抽象工厂：吧包含了一组方法用来生产商品；
 * 具体工厂：用于生产不同产品组，比如抽象工厂用来生产牙膏，那么具体工厂可以用来生产黑人牙膏，或者佳洁士牙膏等等；
 * 抽象产品：这是一个产品家族，每一个具体工厂都能够实现一整组产品，比如一套餐具产品由筷子和勺子组成，那么每个具体工厂都能生产筷子和勺子，但是每个工厂生产的筷子和勺子又是不一样的。
 * 具体产品：
 */
public class Customer {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        Engine engineA = factoryA.createEngine();
        Wheel wheelA = factoryA.createWheel();

        FactoryB factoryB = new FactoryB();
        Engine engineB = factoryB.createEngine();
        Wheel wheelB = factoryB.createWheel();
    }
}
