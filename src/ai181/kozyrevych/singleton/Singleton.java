package ai181.kozyrevych.singleton;

public class Singleton {
    private String s;
    private static Singleton singleton;

    public static synchronized Singleton getSingleton() {
        singleton = singleton == null ? new Singleton() : singleton;
        return singleton;
    }

    private Singleton() {

    }

    public void showS() {
        System.out.println(s);
    }

    public void setS(String s) {
        this.s = s;
    }
}
