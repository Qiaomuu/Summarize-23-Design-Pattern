package Singleton;

/**
 * 线程安全的懒汉式
 */
public class SingletonTwoPlus {
    private SingletonTwoPlus() {
    }
    private static SingletonTwoPlus singletonTwoPlus = null;

    public SingletonTwoPlus getInstance(){
        if(singletonTwoPlus==null){
            //我理解为一个线程更新完singletonTwoPlus后，同步将他的值更新到内存中；
            synchronized (SingletonTwoPlus.class){
                if(singletonTwoPlus==null){
                    singletonTwoPlus = new SingletonTwoPlus();
                }
            }

        }
        return singletonTwoPlus;
    }
}
