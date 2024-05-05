import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class appendfile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the text you want to append:");
    String text = scanner.nextLine();

    try {
      FileWriter writer = new FileWriter("example.txt", true);
      writer.write(text + "\n");
      writer.close();
      System.out.println("Text appended successfully!");
    } catch (IOException e) {
      System.out.println("Error appending to file: " + e.getMessage());
      // Handle the exception, create a new file if it doesn't exist
      try {
        FileWriter writer = new FileWriter("example.txt");
        writer.write(text + "\n");
        writer.close();
        System.out.println("File created and text appended!");
      } catch (IOException e2) {
        System.out.println("Error creating file: " + e2.getMessage());
      }
    } finally {
      scanner.close();
    }
  }
}
