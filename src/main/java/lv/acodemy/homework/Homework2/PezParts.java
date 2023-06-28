package lv.acodemy.homework.Homework2;
public class PezParts {

    private String name;
    private String color;
    private String series;
    private int candyCount;
    private final int maxCapacity = 12;

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

    public void pezDisp() {
        candyCount = 0;
    }

    public int getCandyCount() {
        return candyCount;
    }

    public void setCandyCount(int candyCount) {
        if (candyCount >= 0 && candyCount <= maxCapacity) {
            this.candyCount = candyCount;
        } else {
            System.out.println("Invalid candy count. Candy count must be between 0 and " + maxCapacity);
        }
    }

    public void addCandy() {
        if (candyCount < maxCapacity) {
            candyCount++;
        } else {
            System.out.println("Cannot add more candies. Pez dispenser is already full.");
        }
    }

    public void removeCandy() {
        if (candyCount > 0) {
            candyCount--;
        } else {
            System.out.println("Cannot remove candy. Pez dispenser is already empty.");
        }
    }


    public void fillDispenser() {
        candyCount = maxCapacity;
    }


    public void removeCandies(int amount) {
        if (amount >= 0 && amount <= candyCount) {
            candyCount -= amount;
        } else {
            System.out.println("Invalid amount. Cannot remove " + amount + " candies.");
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
                ", candyCount=" + candyCount +
                ", maxCapacity=" + maxCapacity +
                '}';
    }
}