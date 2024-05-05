import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
public class utility5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String dateString=sc.nextLine();
        LocalDate date=LocalDate.parse(dateString,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String day=date.getDayOfWeek().toString();
        
    }
}
