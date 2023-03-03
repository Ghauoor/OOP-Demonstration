package Methods;

public class Static_Methods {
    int result = Calculator.add(5, 3);

}

class Calculator {
    int n;

    public Calculator(int n) {
        this.n = n;
    }



    public static int add(int a, int b) {
        return a + b;
    }
}
