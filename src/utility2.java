// import java.text.SimpleDateFormat;
// import java.util.Date;

// public class utility2 {
//     public static void main(String[] args) {
//         // Get the current date
//         Date currentDate = new Date();
        
//         // Define the date format
//         SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
//         // Format the current date according to the specified format
//         String presentDay = dateFormat.format(currentDate);
        
//         // Print the present day
//         System.out.println("Present day: " + presentDay);
//     }
// }
import java.text.SimpleDateFormat;
import java.util.Date;
public class utility2{
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat currentDate=new SimpleDateFormat("dd-MM-yyyy");
        String presentDay=currentDate.format(date);
        
    }
}