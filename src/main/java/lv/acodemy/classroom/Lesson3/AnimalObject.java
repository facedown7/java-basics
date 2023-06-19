package lv.acodemy.classroom.Lesson3;

public class AnimalObject {

    private int age;
    private double weight;
    private String color;
    private Enum size;
    private String name;
    private boolean isMammal;
    private int energy = 4;
    private final int MAX_ENERGY = 4;

    public int getEnergy() {
        return energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Enum getSize() {
        return size;
    }

    public void setSize(Enum size) {
        this.size = size;
    }

    public void speak() {
        if (energy <= 0) {
            System.out.println("I don't have enough power to speak.");
            getEnergy();
        } else {
            System.out.println("I am speaking with you");
            energy--;
        }
    }

    public void feed(String foodName) {
        if (energy == MAX_ENERGY) {
            System.out.println("I am full of energy. Let's speak!");
            getEnergy();
        } else {
            System.out.println("I am eating " + foodName);
            energy++;
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public AnimalObject(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public AnimalObject() {
    }

    public AnimalObject(int age, double weight, String color, Enum size, String name, boolean isMammal) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.size = size;
        this.name = name;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "AnimalObject{" +
                "age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", isMammal=" + isMammal +
                '}';
    }
}
