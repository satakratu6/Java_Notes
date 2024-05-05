// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.Reader;
// import java.util.Scanner;

// public class readFile {
//     public static void main(String[] args) {
//         try {
//             File Obj = new File("myfile1.txt");
//             Scanner Reader = new Scanner(Obj);
//             while (Reader.hasNextLine()) {
//                 String data = Reader.nextLine();
//                 System.out.println(data);
//             }
//             Reader.close();
//         }
//         catch (FileNotFoundException e) {
//             System.out.println("An error has occurred.");
//             // e.printStackTrace();
//         }
//     }
// }
import java.io.FileNotFoundException;
import java.io.File;
import java.io.Reader;
import java.util.Scanner;
public class readFile{
    public static void main(String[] args) {
        try{
            File obj=new File("myFile1.txt");
            Scanner Reader=new Scanner(obj);
            if(Reader.hasNextLine()){
                String data=Reader.nextLine();
                System.out.println(data);
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}