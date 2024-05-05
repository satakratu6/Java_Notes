import java.util.Scanner;
// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
// public class utility1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String borrowDateStr=sc.nextLine();
//         LocalDate borrowDate=LocalDate.parse(borrowDateStr,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//         int returnPeriod=sc.nextInt();
//         LocalDate dueDate=borrowDate.plusDays(returnPeriod);
//         System.out.println(dueDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
//     }
// }
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class utility1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String dateStr=sc.nextLine();
        LocalDate date=LocalDate.parse(dateStr,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        int dueTime=sc.nextInt();
        LocalDate dueDate=date.plusDays(dueTime);
        System.out.println(dueDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}