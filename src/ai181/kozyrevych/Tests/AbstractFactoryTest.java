package ai181.kozyrevych.Tests;

import ai181.kozyrevych.abstractFactory.Apple.DevicesApple;
import ai181.kozyrevych.abstractFactory.Apple.PCApple;
import ai181.kozyrevych.abstractFactory.Apple.PhoneApple;
import ai181.kozyrevych.abstractFactory.Apple.TVApple;
import ai181.kozyrevych.abstractFactory.Devices;
import ai181.kozyrevych.abstractFactory.PC;
import ai181.kozyrevych.abstractFactory.Phone;
import ai181.kozyrevych.abstractFactory.Samsung.DevicesSamsung;
import ai181.kozyrevych.abstractFactory.Samsung.PCSamsung;
import ai181.kozyrevych.abstractFactory.Samsung.PhoneSamsung;
import ai181.kozyrevych.abstractFactory.Samsung.TVSamsung;
import ai181.kozyrevych.abstractFactory.TV;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertSame;

public class AbstractFactoryTest {
    Devices devices;

    @Test
    @DisplayName("Test Apple implementation of PC, PHONE, TV")
    void checkAppleImpl() {
        PC pc = new PCApple();
        Phone phone = new PhoneApple();
        TV tv = new TVApple();
        assertAll(() -> assertSame("PCApple", pc.getName()),
                () -> assertSame("PhoneApple", phone.getName()),
                () -> assertSame("TVApple", tv.getName()));
    }

    @Test
    @DisplayName("Test Samsung implementation of PC, PHONE, TV")
    void checkSamsungImpl() {
        PC pc = new PCSamsung();
        Phone phone = new PhoneSamsung();
        TV tv = new TVSamsung();
        assertAll(() -> assertSame("PCSamsung", pc.getName()),
                () -> assertSame("PhoneSamsung", phone.getName()),
                () -> assertSame("TVSamsung", tv.getName()));
    }

    @Test
    @DisplayName("Test abstract factory for apple factory")
    void checkAppleFactory() {
        Devices devices = new DevicesApple();
        assertAll(() -> assertSame("PCApple", devices.getPC().getName()),
                () -> assertSame("PhoneApple", devices.getPhone().getName()),
                () -> assertSame("TVApple", devices.getTV().getName()));
    }

    @Test
    @DisplayName("Test abstract factory for samsung and than apple factory")
    void checkSamsungAndThanAppleFactory() {
        devices = new DevicesSamsung();
        assertAll(() -> assertSame("PCSamsung", devices.getPC().getName()),
                () -> assertSame("PhoneSamsung", devices.getPhone().getName()),
                () -> assertSame("TVSamsung", devices.getTV().getName()));
        devices = new DevicesApple();
        assertAll(() -> assertSame("PCApple", devices.getPC().getName()),
                () -> assertSame("PhoneApple", devices.getPhone().getName()),
                () -> assertSame("TVApple", devices.getTV().getName()));
    }


}
