package ai181.kozyrevych.factoryMethod;

public interface ObjectFactory {
    public MyObject getObject();

    static ObjectFactory getObjectFactory(String name) {
        if (name.equals("obj1")) {
            return new MyObjectN1Factory();
        } else if (name.equals("obj2")) {
            return new MyObjectN2Factory();
        }
        throw new IllegalArgumentException("incorrect name");
    }
}
