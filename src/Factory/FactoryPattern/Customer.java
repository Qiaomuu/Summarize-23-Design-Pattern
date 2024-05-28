package Factory.FactoryPattern;

import Factory.Bean.BMW;

/**
 * 符合开闭原则，每次新增产品时，只需新增产品类和他对应的具体的工厂；
 * 工厂模式的缺点：我必须要指知道所有的类和他创造他的具体的工厂；
 */
public class Customer {
    public static void main(String[] args) {
        Factory320 factory320 = new Factory320();
        BMW bmw320 = factory320.createBMW();

        Factory523 factory523 = new Factory523();
        BMW bmw523 = factory523.createBMW();
    }
}
