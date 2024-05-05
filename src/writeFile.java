// // Import the FileWriter class
// import java.io.FileWriter; 

// // Import the IOException class for handling errors
// import java.io.IOException; 

// public class writeFile {
// 	public static void main(String[] args)
// 	{
// 		try {
// 			FileWriter Writer
// 				= new FileWriter("myfile.txt");
// 			Writer.write(
// 				"Files in Java are seriously good!!");
// 			Writer.close();
// 			System.out.println("Successfully written.");
// 		}
// 		catch (IOException e) {
// 			System.out.println("An error has occurred.");
// 			e.printStackTrace();
// 		}
// 	}
// }
import java.io.FileWriter;
import java.io.IOException;
class writeFile{
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("myFile1.txt");
            writer.write("What is your name?");
            writer.close();

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}