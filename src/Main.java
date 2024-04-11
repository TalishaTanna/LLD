import Creational.Singleton.SingletonDoubleCheck;

public class Main {

    public static void main(String[] args) {
        SingletonDoubleCheck s1 = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck s2 = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck s3 = SingletonDoubleCheck.getInstance();

        System.out.println("S1 :" + s1 + " S2 :" + s2 + " S3 :" + s3);
    }
}
