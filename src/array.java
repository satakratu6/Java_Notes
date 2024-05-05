import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Elements of the array greater than 20:");
        for (int i = 0; i < n; i++) {
            if(array[i] > 20){
                System.out.println(array[i]);
            }
        }
    }
}
