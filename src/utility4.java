import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;
public class utility4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String currentDate=sc.nextLine();
        LocalDate date=LocalDate.parse(currentDate);
        String presentDate=date.format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy"));
        System.out.println(presentDate);
    }
}