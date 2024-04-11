package Creational.Singleton;

public class SingletonSingleLock {
    // Lazy loading
    private static SingletonSingleLock singletonSingleLock = null;

    private SingletonSingleLock() {

    }

    public static SingletonSingleLock getInstance() {
        synchronized (SingletonSingleLock.class)
        {
            if(singletonSingleLock == null)
            {
                singletonSingleLock = new SingletonSingleLock();
            }
        }
        return singletonSingleLock;
    }
}
