package lv.acodemy.homework.Homework2;
public class PezParts {
    private String name;
    private String color;
    private String series;
    private int candyCount;
    private final int MAX_CANDY = 12;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getCandyCount() {
        return candyCount;
    }

    public void setCandyCount(int candyCount) {
        this.candyCount = candyCount;
    }

    public void eatOneCandy(){
        if (candyCount < 0) {
            candyCount--;
            System.out.println("You've eaten 1 candy.");
        } else {
            System.out.println("No more candies. Refill me.");
        }
    }

    public PezParts() {
    }

    public PezParts(String name, String color, String series) {
        this.name = name;
        this.color = color;
        this.series = series;
    }

    @Override
    public String toString() {
        return "PezParts{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", series='" + series + '\'' +
                '}';
    }
}