public class Calculator {
    // Метод сложения двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод сложения трёх чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегруженный метод для вещественных чисел
    public double add(double a, double b) {
        return a + b;
    }
}
