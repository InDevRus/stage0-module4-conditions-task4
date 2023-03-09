package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        var maximum = first > second ? first : second;

        System.out.println(maximum);
    }
}
