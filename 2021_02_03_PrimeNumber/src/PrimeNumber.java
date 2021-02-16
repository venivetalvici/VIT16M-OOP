
public class PrimeNumber {
    public static void main(String[] args) {
        // Дано число найти все ПРОСТЫЕ ЧИСЛА меньше данного числа.
        findAllPrimeNumber(1000_000);
        System.out.println(isPrimeNumber(10001));

    }

    private static void findAllPrimeNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    // n sqrt(n)
    // n в степени н
    //
    private static boolean isPrimeNumber(int input) {
        int border = (int) Math.sqrt(input);
        for (int i = 2; i <= border; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}