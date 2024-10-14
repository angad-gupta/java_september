package oct5;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.sum(2,4);
        int div = calc.division(4,2);

        System.out.println("Sum is " + div);
    }
}
