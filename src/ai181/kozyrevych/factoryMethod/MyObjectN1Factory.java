package ai181.kozyrevych.factoryMethod;

public class MyObjectN1Factory implements ObjectFactory {
    @Override
    public MyObject getObject() {
        return new MyObjectN1();
    }
}
