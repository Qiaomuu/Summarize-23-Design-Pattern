package Singleton;

/**
 * 内部类写法
 * 在SingletonThree类被加载时，静态内部类不会被加载，只有在调用getInstance方法时，才会加载内部类;
 */
public class SingletonThree {
    private SingletonThree(){};
    private static class SingletonInnerClass{
        private static SingletonThree singletonThree = new SingletonThree();
    }
    public SingletonThree getInstance(){
        return SingletonInnerClass.singletonThree;
    }
}
