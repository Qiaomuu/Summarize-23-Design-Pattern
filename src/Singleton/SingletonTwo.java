package Singleton;

/**
 * 单例设计模式的懒汉写法，线程不安全
 */
public class SingletonTwo {
    private SingletonTwo() {
    }
    private static SingletonTwo singletonTwo = null;

    public SingletonTwo getInstance(){
        if(singletonTwo==null){
            singletonTwo = new SingletonTwo();
        }
        return singletonTwo;
    }
}
