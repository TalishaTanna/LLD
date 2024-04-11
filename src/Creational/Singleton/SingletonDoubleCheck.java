package Creational.Singleton;

public class SingletonDoubleCheck {

    // Lazy loading
    private static SingletonDoubleCheck singletonDoubleLock = null;

    private SingletonDoubleCheck() {

    }

    public static SingletonDoubleCheck getInstance() {
        if(singletonDoubleLock == null)
        {
            synchronized (SingletonDoubleCheck.class)
            {
                if (singletonDoubleLock == null)
                {
                    singletonDoubleLock = new SingletonDoubleCheck();
                }
            }
        }
        return singletonDoubleLock;
    }
}
