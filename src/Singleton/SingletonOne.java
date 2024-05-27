package Singleton;

/**
 * 所谓单例模式就是保证一个类只被实例化一个对象；
 * 实现原理：
 * ①将构造方法私有化；
 * ②在类内实例化对象；
 * ③暴露给外部一个得到该对象的方法；
 * 有几种创建方式：
 * 1.类加载时自动创建实例对象;--占用内存
 * 2.懒加载：只有在需要时才会实例花对象；  --推荐使用;
 */


public class SingletonOne {
    private SingletonOne() {
    }
    private static SingletonOne singletonOne = new SingletonOne();

    public SingletonOne getInstance(){
        return singletonOne;
    }
}
