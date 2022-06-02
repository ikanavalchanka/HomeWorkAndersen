package Task3;

public class Sum {
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = -10, b = 10;
        if (a + b >= 0) {
            System.out.println("SUMMA POLOZHITELNAYA");
        }
        if (a + b < 0) {
            System.out.println("SUMMA OTRITSATELNAYA");
        }
    }
}
