package lv.acodemy.homework.Homework2;

public class PezDispenser {
    public static void main(String[] args) {

        PezParts dispenser = new PezParts("Iron Man", "Red/Yellow", "MARVEL");
        System.out.println(dispenser);

        dispenser.addCandy();
        System.out.println(dispenser);

        dispenser.removeCandy();
        System.out.println(dispenser);

        dispenser.fillDispenser();
        System.out.println(dispenser);

        dispenser.removeCandies(7);
        System.out.println(dispenser);

        dispenser.setCandyCount(15);

    }
}
