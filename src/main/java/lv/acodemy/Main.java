package lv.acodemy;

public class Main {
    public static void main(String[] args) {

        // one line comment

        /*
        This is
        multi-line comment
         */

        // primitive data types

        // double
        double pi = 3.14;
        System.out.println(pi);

        // float
        float weight = 70.34f;
        System.out.println(weight);

        // int (integer)
        int populationOfLatvia = 1700000;
        System.out.println(populationOfLatvia);

        // char
        char myFirstNameChar = 'S';
        System.out.println(myFirstNameChar);

        // byte
        byte age = 28;
        System.out.println(age);

        // boolean [is, has]
        boolean isSummer = true;
        System.out.println(isSummer);
        boolean isWinter = false;
        System.out.println(isWinter);

        // string
        String name = "Stanislav";
        String surname = "Selescev";
        System.out.println(name + " " + surname);
        System.out.printf("My name is: %s. My surname is: %s\n", name, surname);
        System.out.println(String.format("My name is: %s. My surname is: %s", name, surname));

        // operator
            int a = 10;
            int b = 5;
            int c = a + b;
        System.out.println(c);

        double d = 28.54;
        double e = 9.01;
        double f = d - e;
        System.out.println(f);
        // 10 + 5 - 9.01
        System.out.println(a + b - e);

        int x = 10;
        int y = 10 % 4;
        System.out.println(y);

        

    }
}