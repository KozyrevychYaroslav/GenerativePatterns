package ai181.kozyrevych.factoryMethod;

public class MyObjectN2Factory implements ObjectFactory {
    @Override
    public MyObject getObject() {
        return new MyObjectN2();
    }
}