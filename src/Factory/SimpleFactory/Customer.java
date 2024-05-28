package Factory.SimpleFactory;
import Factory.Bean.*;

/**
 * 简单工厂模式缺点：每次新增一个产品都需要修改工厂类，不符合开闭原则，而且容易造成工厂逻辑过于复杂；
 */
public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW("320");
        BMW bmw523 = factory.createBMW("523");
    }
}
