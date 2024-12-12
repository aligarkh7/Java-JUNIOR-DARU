package Homework_10.Exercise_3;

import Homework_10.Exercise_3.ExampleForAbstractClass.Animals;
import Homework_10.Exercise_3.ExampleForAbstractClass.Cat;
import Homework_10.Exercise_3.ExampleForAbstractClass.Dog;
import Homework_10.Exercise_3.ExampleForInterface.LogitechMouseG102;
import Homework_10.Exercise_3.ExampleForInterface.Mouse;

public class Main {
    public static void main(String[] args) {

        // Пример для абстрактного класса
        Animals[] animals = {
                new Cat(10,"White","Murka"),
                new Dog(15, "Black","Tuzik")
        };

        for (Animals animal: animals){
            animal.voice();
            animal.eat();
            animal.sleep();
        }

        // Пример для интерфейса
        Mouse mouseG102 = new LogitechMouseG102();
        mouseG102.click();
        mouseG102.move(1920,1080);
        mouseG102.clickButtonDpi();
        mouseG102.clickButtonDpi();
        mouseG102.clickButtonDpi();
        mouseG102.clickButtonDpi();
        mouseG102.clickButtonDpi();
    }
}
