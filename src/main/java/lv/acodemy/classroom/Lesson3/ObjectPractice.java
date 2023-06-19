package lv.acodemy.classroom.Lesson3;

import com.sun.tools.javac.Main;
import lv.acodemy.classroom.Lesson3.AnimalObject;

import static lv.acodemy.classroom.Lesson3.Sizes.*;

public class ObjectPractice {

    public static void main(String[] args) {

        AnimalObject barsik = new AnimalObject();

        String catName = barsik.getName();
        barsik.setName("Barsik");
        System.out.println("Cat name is: " + barsik.getName());

        int catAge = barsik.getAge();
        barsik.setAge(3);
        System.out.println("My cat is: " + barsik.getAge() + " years old.");

        double catWeight = barsik.getWeight();
        barsik.setWeight(5);
        System.out.println("My cat weight is: " + barsik.getWeight() + " kg");

        String catColor = barsik.getColor();
        barsik.setColor("Black");
        System.out.println("Barsik color is: " + barsik.getColor());

        Enum catSize = barsik.getSize();
        barsik.setSize(M);
        System.out.println("Barsik size is: " + barsik.getSize());

        barsik.setMammal(true);
        barsik.setMammal(barsik.isMammal());
        System.out.println("Barisk is mammal: " + barsik.isMammal());

        //==============================================
        AnimalObject ballzik = new AnimalObject(13, "Ballzik");
        System.out.printf("My name is %s. I am %d years old. \n", ballzik.getName(), ballzik.getAge());

        //==============================================
        AnimalObject archi = new AnimalObject(3, 14.2, "ginger", L, "Archibald", true);
        System.out.println(archi);

        archi.speak();
        archi.feed("Medium rare steak");
        archi.getEnergy();


    }
}
