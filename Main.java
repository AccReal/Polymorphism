public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum of 2 integers: " + calculator.add(5, 10));
        System.out.println("Sum of 3 integers: " + calculator.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + calculator.add(5.5, 10.5));
    }
}
