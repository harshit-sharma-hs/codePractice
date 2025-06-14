public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                try {
                    if (instance == null)
                        instance = new Singleton();
                } catch (Exception e) {
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

}
