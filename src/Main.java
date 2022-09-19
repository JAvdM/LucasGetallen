import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        while (n < 1 || n > 45) {
            System.out.println("Geef een positief getal onder de 46:");
            n = Integer.valueOf(scanner.nextLine());
        }

        int a = 2;
        int b = 1;
        int c = 0;

        System.out.println(2);
        System.out.println(1);
        for (int i = 0; i < (n - 2); i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}