package Creational.Singleton;

public class EagerLoding {

    private static EagerLoding eagerLoding = new EagerLoding();
    private EagerLoding() {

    }

    public static EagerLoding getInstance() {
        return eagerLoding;
    }
}
