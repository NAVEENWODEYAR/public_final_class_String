package com.string.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Naveen K Wodeyar
 * @date 20-May-2025
 */

public class OverloadingVsOverridingTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream)); // Redirect stdout to capture output
    }

    @Test
    public void testAnimalMakeSound_NoArgs() {
        Animal animal = new Animal();
        animal.makeSound();
        assertTrue(outputStream.toString().contains("Some generic animal sound"));
    }

    @Test
    public void testAnimalMakeSound_WithArgs() {
        Animal animal = new Animal();
        animal.makeSound("Roar");
        assertTrue(outputStream.toString().contains("Animal makes sound: Roar"));
    }

    @Test
    public void testAnimalEat() {
        Animal animal = new Animal();
        animal.eat();
        assertTrue(outputStream.toString().contains("Animal is eating"));
    }

    @Test
    public void testDogEat_OverridesAnimal() {
        Dog dog = new Dog();
        dog.eat();
        assertTrue(outputStream.toString().contains("Dog is eating dog food"));
    }

    @Test
    public void testDogMakeSound_Inherited() {
        Dog dog = new Dog();
        dog.makeSound();
        assertTrue(outputStream.toString().contains("Some generic animal sound"));
    }

    @Test
    public void testDogMakeSound_OverloadedInBase() {
        Dog dog = new Dog();
        dog.makeSound("Bark");
        assertTrue(outputStream.toString().contains("Animal makes sound: Bark"));
    }

    @Test
    public void testDogMakeSound_OverloadedInSubclass() {
        Dog dog = new Dog();
        dog.makeSound(3);
        String output = outputStream.toString();
        long woofCount = output.lines().filter(line -> line.equals("Woof!")).count();
        assertTrue(woofCount == 3);
    }
}
