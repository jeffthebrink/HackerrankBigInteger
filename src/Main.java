import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1, string2;

        string1 = scanner.nextLine();
        string2 = scanner.nextLine();

        System.out.println(new BigInteger(string1).add(new BigInteger(string2)));
        System.out.println(new BigInteger(string1).multiply(new BigInteger(string2)));

        scanner.close();
    }
}
