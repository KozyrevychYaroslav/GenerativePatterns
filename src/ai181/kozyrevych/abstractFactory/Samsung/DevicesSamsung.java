package ai181.kozyrevych.abstractFactory.Samsung;

import ai181.kozyrevych.abstractFactory.Devices;
import ai181.kozyrevych.abstractFactory.PC;
import ai181.kozyrevych.abstractFactory.Phone;
import ai181.kozyrevych.abstractFactory.TV;

public class DevicesSamsung implements Devices {
    @Override
    public PC getPC() {
        return new PCSamsung();
    }

    @Override
    public Phone getPhone() {
        return new PhoneSamsung();
    }

    @Override
    public TV getTV() {
        return new TVSamsung();
    }
}
