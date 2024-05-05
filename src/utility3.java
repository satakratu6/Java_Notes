import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class utility3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LocalDate currentDate=LocalDate.now();
        DateTimeFormatter formatDate=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Present Day: "+formatDate.format(currentDate));
        int due=sc.nextInt();
        LocalDate dueDate=currentDate.plusDays(due);
        System.out.println("Due Date: "+dueDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}