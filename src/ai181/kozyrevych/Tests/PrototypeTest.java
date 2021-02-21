package ai181.kozyrevych.Tests;

import ai181.kozyrevych.prototype.Prototype;
import ai181.kozyrevych.singleton.Singleton;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertSame;


public class PrototypeTest {
    Prototype p = new Prototype(1, 2);


    @Test
    @DisplayName("Cloning using Prototype object. Refs check")
    void checkPrototypeRefs() {
        Prototype p1 = (Prototype)p.myClone();
        assertNotSame(p, p1, "Ссылки одинаковые");
    }

    @Test
    @DisplayName("Checking values in prototype")
    void checkPrototypeValues() {
        Prototype p1 = (Prototype)p.myClone();
        assertAll("Values are not the same", () -> assertThat(p1.getField1(), Is.is(p.getField1())),
                () -> assertThat(p1.getField2(), Is.is(p.getField2())));
    }
}
