package ood.patterns.creational.singleton;

public class Singleton {

//  => Synchronized Accessor

    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


/*
    => Double Checked Locking & volatile

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }

 */


/*
    => Synchronized Accessor

    public static final Singleton INSTANCE = new Singleton();

 */


/*
    => Enum Singleton

    public enum Singleton {
        INSTANCE;
    }
*/

}
