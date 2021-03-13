package ai181.kozyrevych.abstractFactory;

public class CreateDevices {
    Devices factory;

    public CreateDevices(Devices factory) {
        this.factory = factory;
    }

    public void createDevices() {
        System.out.println(factory.getPC().getName());
        System.out.println(factory.getPhone().getName());
        System.out.println(factory.getTV().getName());
    }
}
