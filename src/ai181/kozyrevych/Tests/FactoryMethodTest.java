package ai181.kozyrevych.Tests;

import ai181.kozyrevych.factoryMethod.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertSame;


public class FactoryMethodTest {

    @Test
    @DisplayName("Test of input of MyObjectN1")
    void checkPrototypeRefsN1() {
        MyObject m = new MyObjectN1();
        assertSame("It`s my objectN1", m.getObjectName());
    }

    @Test
    @DisplayName("Test of input of MyObjectN2")
    void checkPrototypeRefsN2() {
        MyObject m = new MyObjectN2();
        assertSame("It`s my objectN2", m.getObjectName());
    }

    @Test
    @DisplayName("Checking factory oj MyObjectN1")
    void checkFactory1() {
        ObjectFactory factory = ObjectFactory.getObjectFactory("obj1");
        MyObject m = factory.getObject();
        assertSame("It`s my objectN1", m.getObjectName());
    }

    @Test
    @DisplayName("Checking factory oj MyObjectN2")
    void checkFactory2() {
        ObjectFactory factory = ObjectFactory.getObjectFactory("obj2");
        MyObject m = factory.getObject();
        assertSame("It`s my objectN2", m.getObjectName());
    }

    @Test
    @DisplayName("Checking factory exception when use incorrect string name")
    void checkException() {
        assertThrows(RuntimeException.class, () -> ObjectFactory.getObjectFactory("TEST_EXCEPTION"));
    }

}
