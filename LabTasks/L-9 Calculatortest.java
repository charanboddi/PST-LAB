class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

public class Calculatortest {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Test Addition
        if (calc.add(10, 20) == 30) {
            System.out.println("Addition Test: PASSED");
        } else {
            System.out.println("Addition Test: FAILED");
        }

    
        if (calc.divide(20, 10) == 2) {
            System.out.println("Division Test: PASSED");
        } else {
            System.out.println("Division Test: FAILED");
        }
    }
}