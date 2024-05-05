import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// public class file3 {

//   public static void main(String[] args) {
//     String fileName = "marks.txt"; // Replace with your actual file name

//     try {
//       Scanner scanner = new Scanner(new File(fileName));
//       int count = 0;
//       double sum = 0.0;
//       int maxMark = Integer.MIN_VALUE;
//       int minMark = Integer.MAX_VALUE;

//       while (scanner.hasNextInt()) {
//         int mark = scanner.nextInt();
//         count++;
//         sum += mark;
//         maxMark = Math.max(maxMark, mark); // Update max using Math.max()
//         minMark = Math.min(minMark, mark); // Update min using Math.min()
//       }

//       if (count > 0) {
//         double average = sum / count;
//         System.out.println("Maximum mark: " + maxMark);
//         System.out.println("Minimum mark: " + minMark);
//         System.out.println("Average mark: " + average);
//       } else {
//         System.out.println("File is empty or contains no valid marks.");
//       }
//       scanner.close();
//     } catch (FileNotFoundException e) {
//       System.out.println("Error: File not found - " + fileName);
//     }
//   }
// }
class file3{
  public static void main(String[] args) {
    String fileName="marks1.txt";
    try{
      Scanner sc=new Scanner(new File(fileName));
      int count=0;
      double sum=0;
      int maxMark=Integer.MIN_VALUE;
      int minMark=Integer.MAX_VALUE;
      while(sc.hasNextInt()){
        int mark=sc.nextInt();
        count++;
        sum+=mark;
        maxMark=Math.max(maxMark,mark);
        minMark=Math.min(minMark, mark);
      }
      if(count>0){
        double average=sum/count;
        System.out.println("Max : "+maxMark);
        System.out.println("Min: "+minMark);
        System.out.println("Average: "+average);
      } else{
        System.out.println("no contents or file doesn't exisxt");
      }
    } catch(FileNotFoundException e){
      System.out.println("File doesn't exist");
    }
  }
}