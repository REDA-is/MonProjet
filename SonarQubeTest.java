public class SonarQubeTest {
    private static int UNUSED_VARIABLE = 42; // SonarQube va signaler cette variable comme inutilisée.

    public static void main(String[] args) {
        System.out.println("Hello, SonarQube!");

        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Erreur : Division par zéro !");
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Impossible de diviser par zéro");
        }
        return a / b;
    }
}
