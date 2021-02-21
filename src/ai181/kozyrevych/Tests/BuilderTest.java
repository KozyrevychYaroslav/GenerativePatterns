package ai181.kozyrevych.Tests;

import ai181.kozyrevych.abstractFactory.Apple.PCApple;
import ai181.kozyrevych.abstractFactory.Apple.PhoneApple;
import ai181.kozyrevych.abstractFactory.Apple.TVApple;
import ai181.kozyrevych.abstractFactory.PC;
import ai181.kozyrevych.abstractFactory.Phone;
import ai181.kozyrevych.abstractFactory.TV;
import ai181.kozyrevych.builder.Person;
import ai181.kozyrevych.factoryMethod.MyObject;
import ai181.kozyrevych.factoryMethod.MyObjectN1;
import ai181.kozyrevych.factoryMethod.MyObjectN2;
import ai181.kozyrevych.factoryMethod.ObjectFactory;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertSame;

public class BuilderTest {
    Person p = new Person.Builder().setHeight(100).setName("name").setWeight(60).build();

    @Test
    @DisplayName("Test Builder(Person) nums work")
    void checkBuilderNums() {

        assertThat(60, Is.is(p.getWeight()));
        assertThat(100, Is.is(p.getHeight()));
        assertThat("name", Is.is(p.getName()));
        assertSame(null, p.getSurname(), "object is not null");
    }
}
