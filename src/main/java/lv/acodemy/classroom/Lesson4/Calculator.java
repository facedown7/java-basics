package lv.acodemy.classroom.Lesson4;

public class Calculator {

    private String name;
    private String modelName;

    public int sum(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int divide(int x, int y) {
        return x / y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int squareNumber(int x, int y) {
        return (int) Math.pow(x, 2);
    }

    public Calculator(String name, String modelName) {
        this.name = name;
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "name='" + name + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
