import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float floatValue = scanner.nextFloat();

        int intValue = Math.round(floatValue);

        System.out.println(intValue);
    }
}
