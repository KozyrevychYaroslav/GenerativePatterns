package ai181.kozyrevych.Tests;

import ai181.kozyrevych.singleton.Singleton;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;


class SingletonTest {

    @Test
    @DisplayName("Multiple singleton object creation. Refs check")
    void checkSingletonRefs() {
        Singleton s = Singleton.getSingleton();
        Singleton s1 = Singleton.getSingleton();
        assertTrue(s == s1, "Синглтон не работает (ссылки разные)");
    }

    @Test
    @DisplayName("Check on null")
    void checkSingletonNull() {
        Singleton s = Singleton.getSingleton();
        assertNotNull(s, "null после создания обьекта");
    }

}