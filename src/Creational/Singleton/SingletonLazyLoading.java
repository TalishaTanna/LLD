package Creational.Singleton;

public class SingletonLazyLoading {
    // Lazy loading
    private static SingletonLazyLoading singletonLazyLoading = null;

    private SingletonLazyLoading() {

    }

    public static SingletonLazyLoading getInstance() {
        if(singletonLazyLoading == null)
        {
            singletonLazyLoading = new SingletonLazyLoading();
        }
        return singletonLazyLoading;
    }
}
