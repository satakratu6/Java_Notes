// import java.io.File;
// import java.io.FileWriter;
// import java.io.FileReader;
// import java.io.IOException;

// public class file2 {
//     public static void main(String[] args) {
//         // Step 1: Create a new File object representing the file "example.txt"
//         File file = new File("example.txt");
        
//         try {
//             // Step 2: Create the file
//             if (file.createNewFile()) {
//                 System.out.println("File created successfully.");
//             } else {
//                 System.out.println("File already exists.");
//             }

//             // Step 3: Use the FileWriter class to write the text "Hello, World!" to the file
//             FileWriter writer = new FileWriter(file);
//             writer.write("Hello, World!");
            
//             // Step 4: Close the FileWriter object
//             writer.close();
            
//             // Step 5: Use the FileReader class to read the contents of the file
//             FileReader reader = new FileReader(file);
//             int character;
            
//             // Step 6: Read each character from the file until the end of the file is reached
//             while ((character = reader.read()) != -1) {
//                 // Step 7: Print each character to the console
//                 System.out.print((char) character);
//             }
            
//             // Step 8: Close the FileReader object
//             reader.close();
            
//         } catch (IOException e) {
//             System.out.println("An error occurred: " + e.getMessage());
//             e.printStackTrace();
//         }
//     }
// }
// import java.io.File;
// import java.io.FileWriter;
// import java.io.FileReader;
// import java.io.IOException;
// public class file2{
//     public static void main(String[] args) {
//         File file=new File("new1.txt");
//         try{
//             if(file.createNewFile()){
//                 System.out.println(file.getName()+" succefully created");
//             } else{
//                 System.out.println("File already exists");
//             }
//             FileWriter writer=new FileWriter("new1.txt");
//             writer.write("Hello world");
//             writer.close();
//             FileReader reader=new FileReader(file);
//             int character;
//             while((character=reader.read())!=-1){
//                 System.out.print((char) character);
//             }
//             reader.close();
//         } catch(IOException e){
//             System.out.println("An error has occoured");
//         }
//     }
// }
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class file2{
    public static void main(String[] args) {
        File file=new File("myFile1.txt");
        try{
            if(file.createNewFile()){
                System.out.println(file.getName()+" succefully created");
            } else{
                System.out.println("Already exists");
            }
            FileWriter writer=new FileWriter(file);
            writer.write("How are you?");
            writer.close();
            FileReader reader=new FileReader(file);
            int character;
            while((character=reader.read())!=-1){
                System.out.print((char) character);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}