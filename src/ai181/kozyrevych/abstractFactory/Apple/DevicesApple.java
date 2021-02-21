package ai181.kozyrevych.abstractFactory.Apple;

import ai181.kozyrevych.abstractFactory.Devices;
import ai181.kozyrevych.abstractFactory.PC;
import ai181.kozyrevych.abstractFactory.Phone;
import ai181.kozyrevych.abstractFactory.TV;

public class DevicesApple implements Devices {
    @Override
    public PC getPC() {
        return new PCApple();
    }

    @Override
    public Phone getPhone() {
        return new PhoneApple();
    }

    @Override
    public TV getTV() {
        return new TVApple();
    }
}
